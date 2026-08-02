package com.vk.clips.design.view;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.clips.design.view.QRSharingView;
import com.vk.core.ui.tracking.views.UiTracking$TrackableView;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.permission.PermissionHelper;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.t0;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import io.reactivex.rxjava3.android.schedulers.a;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.operators.observable.s0;
import xsna.asu0;
import xsna.bwt0;
import xsna.c230;
import xsna.e370;
import xsna.e3m;
import xsna.efx0;
import xsna.epx;
import xsna.f1s;
import xsna.ggb0;
import xsna.gz80;
import xsna.gzs;
import xsna.itg0;
import xsna.mga0;
import xsna.nme0;
import xsna.ome0;
import xsna.p31;
import xsna.pk9;
import xsna.s3q0;
import xsna.t520;

/* compiled from: QRSharingView.kt */
/* loaded from: classes16.dex */
public final class QRSharingView extends ScrollView implements UiTracking$TrackableView {
    public static final /* synthetic */ int g = 0;
    public String b;
    public boolean c;
    public Uri d;
    public gzs<s3q0> e;
    public final View f;

    public QRSharingView(Context context) {
        super(context);
        LayoutInflater.from(getContext()).inflate(R.layout.qr_sharing_view, this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        bwt0.i0(findViewById(R.id.save), new mga0(this, 9));
        bwt0.i0(findViewById(R.id.share), new ggb0(this, 7));
        View findViewById = findViewById(R.id.my_qr_hint);
        this.f = findViewById;
        findViewById.post(new p31(this, 17));
        ((VkImageSimple) findViewById(R.id.qr_image)).setContentDescription(getResources().getString(R.string.accessibility_qr_profile));
    }

    private final String getRef() {
        return epx.f(this.b, t0.a(MobileOfficialAppsCoreNavStat$EventScreen.PROFILE)) ? this.c ? t0.a(MobileOfficialAppsCoreNavStat$EventScreen.PROFILE_MY) : this.b : this.b;
    }

    private final String getSharingType() {
        String str = this.b;
        return epx.f(str, t0.a(MobileOfficialAppsCoreNavStat$EventScreen.GROUP)) ? "group" : epx.f(str, t0.a(MobileOfficialAppsCoreNavStat$EventScreen.MINI_APP)) ? "vk_app" : epx.f(str, t0.a(MobileOfficialAppsCoreNavStat$EventScreen.IM_CHAT)) ? "chat" : epx.f(str, t0.a(MobileOfficialAppsCoreNavStat$EventScreen.ARTICLE_READ)) ? "article" : epx.f(str, t0.a(MobileOfficialAppsCoreNavStat$EventScreen.FEED_POST)) ? "post" : epx.f(str, t0.a(MobileOfficialAppsCoreNavStat$EventScreen.COMMUNITY_CHANNEL)) ? "channel" : "user";
    }

    public final void a(final boolean z) {
        gzs<s3q0> gzsVar = new gzs() { // from class: xsna.dme0
            @Override // xsna.gzs
            public final Object invoke() {
                Activity h;
                int i = QRSharingView.g;
                QRSharingView qRSharingView = QRSharingView.this;
                VkImageSimple vkImageSimple = (VkImageSimple) qRSharingView.findViewById(R.id.qr_image);
                efx0 efx0Var = e370.k;
                if (efx0Var == null) {
                    efx0Var = null;
                }
                efx0Var.getClass();
                io.reactivex.rxjava3.core.q a = ome0.a(vkImageSimple);
                boolean z2 = z;
                io.reactivex.rxjava3.disposables.c subscribe = a.subscribe(new ksb0(new no1(qRSharingView, z2, 3), 4));
                Context context = qRSharingView.getContext();
                if (context != null && (h = e3m.h(context)) != null) {
                    itg0.a(h, subscribe);
                }
                qRSharingView.b(z2 ? "share" : "save");
                return s3q0.a;
            }
        };
        if (gz80.a(34)) {
            gzsVar.invoke();
            return;
        }
        PermissionHelper permissionHelper = PermissionHelper.a;
        Context context = getContext();
        permissionHelper.getClass();
        permissionHelper.d(context, PermissionHelper.e, R.string.vk_permissions_storage, R.string.vk_permissions_storage, gzsVar, new f1s(23));
    }

    public final void b(String str) {
        String sharingType = getSharingType();
        String ref = getRef();
        b.d dVar = new b.d("qr_sharing");
        dVar.b(str, "action");
        dVar.b(sharingType, "object_type");
        dVar.b(ref, "ref");
        dVar.e();
    }

    public final void c(String str, String str2, boolean z) {
        Activity h;
        efx0 efx0Var = e370.k;
        if (efx0Var == null) {
            efx0Var = null;
        }
        Context context = getContext();
        efx0Var.getClass();
        new String();
        c subscribe = new s0(new nme0(0, context, new ome0.a(str, str2, new pk9.a(0), z, -1, true))).r0(asu0.a.c()).a0(a.b()).subscribe(new t520(new c230(this, 21), 14));
        Context context2 = getContext();
        if (context2 == null || (h = e3m.h(context2)) == null) {
            return;
        }
        itg0.a(h, subscribe);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        b(CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
        super.onDetachedFromWindow();
    }

    public final void setCloseListener(gzs<s3q0> gzsVar) {
        this.e = gzsVar;
    }

    public QRSharingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(getContext()).inflate(R.layout.qr_sharing_view, this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        bwt0.i0(findViewById(R.id.save), new mga0(this, 9));
        bwt0.i0(findViewById(R.id.share), new ggb0(this, 7));
        View findViewById = findViewById(R.id.my_qr_hint);
        this.f = findViewById;
        findViewById.post(new p31(this, 17));
        ((VkImageSimple) findViewById(R.id.qr_image)).setContentDescription(getResources().getString(R.string.accessibility_qr_profile));
    }
}
