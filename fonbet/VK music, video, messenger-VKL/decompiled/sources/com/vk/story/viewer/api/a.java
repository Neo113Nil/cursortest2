package com.vk.story.viewer.api;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.SystemClock;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.story.viewer.api.StoryViewerRouter;
import java.util.ArrayList;
import java.util.List;
import xsna.epx;
import xsna.f5z;
import xsna.kr;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.vu5;
import xsna.yex;

/* compiled from: StoryDialogOpenParams.kt */
/* loaded from: classes6.dex */
public final class a {
    public final Activity a;
    public final ArrayList b;
    public final String c;
    public final StoriesContainer d;
    public final boolean e;
    public final MobileOfficialAppsConStoriesStat$ViewEntryPoint f;
    public final MobileOfficialAppsConStoriesStat$ViewEntryPoint g;
    public final String h;
    public final String i;
    public final String j;
    public final kr k;
    public final StoryViewerRouter.InOutAnimation l;
    public final com.vk.story.api.a m;
    public final int n;
    public final int o;
    public final yex p;
    public final f5z q;
    public final long r;

    public a() {
        throw null;
    }

    public a(Activity activity, ArrayList arrayList, String str, StoriesContainer storiesContainer, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint2, String str2, String str3, String str4, kr krVar, yex yexVar, f5z f5zVar) {
        StoryViewerRouter.InOutAnimation inOutAnimation = StoryViewerRouter.InOutAnimation.PointToFullScreen;
        com.vk.story.api.a aVar = new com.vk.story.api.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.a = activity;
        this.b = arrayList;
        this.c = str;
        this.d = storiesContainer;
        this.e = true;
        this.f = mobileOfficialAppsConStoriesStat$ViewEntryPoint;
        this.g = mobileOfficialAppsConStoriesStat$ViewEntryPoint2;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        this.k = krVar;
        this.l = inOutAnimation;
        this.m = aVar;
        this.n = -1;
        this.o = -1;
        this.p = yexVar;
        this.q = f5zVar;
        this.r = elapsedRealtime;
    }

    public final Activity a() {
        return this.a;
    }

    public final StoryViewerRouter.a b() {
        return this.k;
    }

    public final StoryViewerRouter.InOutAnimation c() {
        return this.l;
    }

    public final List<StoriesContainer> d() {
        return this.b;
    }

    public final MobileOfficialAppsConStoriesStat$ViewEntryPoint e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i) && epx.f(this.j, aVar.j) && epx.f(this.k, aVar.k) && this.l == aVar.l && epx.f(this.m, aVar.m) && this.n == aVar.n && this.o == aVar.o && epx.f(this.p, aVar.p) && epx.f(this.q, aVar.q) && this.r == aVar.r;
    }

    public final DialogInterface.OnDismissListener f() {
        return this.p;
    }

    public final f5z g() {
        return this.q;
    }

    public final String h() {
        return this.j;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ArrayList arrayList = this.b;
        int a = urd0.a((hashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31, 31, this.c);
        StoriesContainer storiesContainer = this.d;
        int hashCode2 = (this.g.hashCode() + ((this.f.hashCode() + qoy.b((a + (storiesContainer == null ? 0 : storiesContainer.hashCode())) * 31, 31, this.e)) * 31)) * 31;
        String str = this.h;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        int a2 = shy.a(this.o, shy.a(this.n, (this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31)) * 31)) * 31, 31), 31);
        yex yexVar = this.p;
        int hashCode5 = (a2 + (yexVar == null ? 0 : yexVar.hashCode())) * 29791;
        f5z f5zVar = this.q;
        return Long.hashCode(this.r) + ((hashCode5 + (f5zVar != null ? f5zVar.hashCode() : 0)) * 31);
    }

    public final StoriesContainer i() {
        return this.d;
    }

    public final String j() {
        return this.h;
    }

    public final com.vk.story.api.a k() {
        return this.m;
    }

    public final boolean l() {
        return this.e;
    }

    public final long m() {
        return this.r;
    }

    public final String n() {
        return this.c;
    }

    public final String o() {
        return this.i;
    }

    public final MobileOfficialAppsConStoriesStat$ViewEntryPoint p() {
        return this.f;
    }

    public final int q() {
        return this.n;
    }

    public final int r() {
        return this.o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryDialogConfig(activity=");
        sb.append(this.a);
        sb.append(", containers=");
        sb.append(this.b);
        sb.append(", storyId=");
        sb.append(this.c);
        sb.append(", openStoriesContainer=");
        sb.append(this.d);
        sb.append(", showStubView=");
        sb.append(this.e);
        sb.append(", viewEntryPoint=");
        sb.append(this.f);
        sb.append(", discoverViewEntryPoint=");
        sb.append(this.g);
        sb.append(", ref=");
        sb.append(this.h);
        sb.append(", trackCode=");
        sb.append(this.i);
        sb.append(", nextFrom=");
        sb.append(this.j);
        sb.append(", animationProvider=");
        sb.append(this.k);
        sb.append(", animationType=");
        sb.append(this.l);
        sb.append(", settings=");
        sb.append(this.m);
        sb.append(", xCenter=");
        sb.append(this.n);
        sb.append(", yCenter=");
        sb.append(this.o);
        sb.append(", dismissListener=");
        sb.append(this.p);
        sb.append(", showListener=null, callback=null, dismissOnDestroyLifecycleOwner=");
        sb.append(this.q);
        sb.append(", startTime=");
        return vu5.a(')', this.r, sb);
    }
}
