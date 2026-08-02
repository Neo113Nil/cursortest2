package com.vk.upload.impl;

import android.app.NotificationChannel;
import android.content.Context;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.vk.api.stats.StatsTrackUploadServerStateAPIRequest;
import com.vk.community.strikes.api.di.CommunityStrikesComponent;
import com.vk.instantjobs.InstantJob;
import com.vk.upload.core.utils.UploadException;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import java.util.Map;
import xsna.ca70;
import xsna.e43;
import xsna.fpf0;
import xsna.k7m;
import xsna.m7m;
import xsna.nc90;
import xsna.ncq0;
import xsna.s7x;
import xsna.sp6;
import xsna.tv4;
import xsna.u6x;
import xsna.w8i;
import xsna.x870;
import xsna.xb20;
import xsna.zyx;

/* compiled from: UploadTask.kt */
/* loaded from: classes11.dex */
public abstract class b<S extends Parcelable> extends sp6<S> {
    public String g;
    public final UploadNotification h;

    /* compiled from: UploadTask.kt */
    public static abstract class a<T extends b<?>> implements s7x<T> {
    }

    /* compiled from: UploadTask.kt */
    /* renamed from: com.vk.upload.impl.b$b, reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C1937b implements w8i {
    }

    public b() {
        int d = com.vk.upload.impl.a.d();
        this.d = d;
        this.h = new UploadNotification(d);
    }

    @Override // xsna.ye6
    public final void E() {
        x870 x870Var = x870.a;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        ca70 ca70Var = ca70.a;
        ca70.f(context).createNotificationChannel(new NotificationChannel("uploads_group", context.getString(R.string.notification_attachments_upload_title), 2));
    }

    @Override // xsna.ye6
    public final String F() {
        return "uploads_group";
    }

    @Override // xsna.ye6
    public final int G() {
        return 10;
    }

    @Override // xsna.ye6
    public void I(zyx zyxVar, Throwable th) {
        ((CommunityStrikesComponent) ((k7m) m7m.f(new C1937b())).a(fpf0.a(CommunityStrikesComponent.class))).ge().d(th, true);
        com.vk.metrics.eventtracking.b.a.a(th);
    }

    @Override // xsna.sp6, xsna.ye6
    public final void J(u6x.a aVar) {
        this.h.j(aVar);
        com.vk.upload.impl.a.f(this);
    }

    @Override // xsna.ye6
    public final void K(Map map, NotificationCompat.h hVar) {
        if (map.get(this) != null) {
            this.h.h(this, hVar);
        }
    }

    @Override // xsna.sp6
    public final j1 P() {
        return b0().U(new xb20(new nc90(21), 20));
    }

    @Override // xsna.sp6
    public void R(Parcelable parcelable) {
        this.h.f(this, parcelable);
    }

    @Override // xsna.sp6
    public void S(Exception exc) {
        this.h.g(this, exc);
    }

    @Override // xsna.sp6
    public void T() {
        this.h.e();
    }

    public String a0() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return context.getString(R.string.loading);
    }

    public abstract q<ncq0> b0();

    public void c0(int i, int i2, boolean z) {
        this.h.d(this, i, i2, z);
    }

    public final void d0(Exception exc, String str, long j, String str2, StatsTrackUploadServerStateAPIRequest.State state, int i, String str3) {
        if ((exc instanceof UploadException) && ((UploadException) exc).d()) {
            StatsTrackUploadServerStateAPIRequest.b bVar = new StatsTrackUploadServerStateAPIRequest.b();
            String str4 = this.g;
            if (str4 != null) {
                bVar.a = str4;
            } else {
                bVar.a = "unknown";
                tv4.b("uploadMethodForStat wasn't initialized", com.vk.metrics.eventtracking.b.a);
            }
            bVar.b = str;
            bVar.f = j;
            bVar.g = str2;
            bVar.c = state;
            bVar.d = i;
            if (state == StatsTrackUploadServerStateAPIRequest.State.SUCCESS) {
                str3 = "";
            }
            bVar.e = str3;
            StatsTrackUploadServerStateAPIRequest statsTrackUploadServerStateAPIRequest = new StatsTrackUploadServerStateAPIRequest(bVar);
            statsTrackUploadServerStateAPIRequest.k = true;
            statsTrackUploadServerStateAPIRequest.p();
        }
    }

    @Override // xsna.sp6, com.vk.instantjobs.InstantJob
    public InstantJob.NotificationShowCondition p() {
        return Q() ? InstantJob.NotificationShowCondition.WHEN_STARTED : InstantJob.NotificationShowCondition.WHEN_UI_INVISIBLE;
    }

    @Override // xsna.sp6, xsna.ye6, com.vk.instantjobs.InstantJob
    public void u(Object obj) {
        this.h.e();
        super.u(obj);
    }
}
