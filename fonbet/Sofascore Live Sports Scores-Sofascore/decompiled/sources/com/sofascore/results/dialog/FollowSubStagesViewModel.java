package com.sofascore.results.dialog;

import android.app.Application;
import android.os.Parcel;
import android.os.Parcelable;
import com.sofascore.model.mvvm.model.StageType;
import defpackage.d17;
import defpackage.dmi;
import defpackage.fqg;
import defpackage.km5;
import defpackage.lec;
import defpackage.lm5;
import defpackage.q8;
import defpackage.tak;
import defpackage.uee;
import defpackage.un0;
import defpackage.waa;
import defpackage.xw3;
import defpackage.yzc;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/sofascore/results/dialog/FollowSubStagesViewModel;", "Lq8;", "SubStageInfo", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FollowSubStagesViewModel extends q8 {
    public final tak e;
    public final Integer f;
    public final Integer g;
    public final List h;
    public final yzc i;
    public final lec j;
    public final yzc k;
    public final lec l;
    public Map m;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sofascore/results/dialog/FollowSubStagesViewModel$SubStageInfo;", "Landroid/os/Parcelable;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SubStageInfo implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SubStageInfo> CREATOR = new b();
        public final int a;
        public final String b;
        public final HashSet c;

        public SubStageInfo(int i, String str, HashSet hashSet) {
            str.getClass();
            hashSet.getClass();
            this.a = i;
            this.b = str;
            this.c = hashSet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubStageInfo)) {
                return false;
            }
            SubStageInfo subStageInfo = (SubStageInfo) obj;
            return this.a == subStageInfo.a && Intrinsics.c(this.b, subStageInfo.b) && Intrinsics.c(this.c, subStageInfo.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + dmi.c(Integer.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder t = dmi.t(this.a, "SubStageInfo(id=", ", name=", this.b, ", typeList=");
            t.append(this.c);
            t.append(")");
            return t.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.a);
            parcel.writeString(this.b);
            HashSet hashSet = this.c;
            parcel.writeInt(hashSet.size());
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                parcel.writeString(((StageType) it.next()).name());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowSubStagesViewModel(Application application, tak takVar, fqg fqgVar) {
        super(application);
        takVar.getClass();
        fqgVar.getClass();
        this.e = takVar;
        this.f = (Integer) fqgVar.a("STAGE_ID");
        this.g = (Integer) fqgVar.a("UNIQUE_STAGE_ID");
        List list = (List) fqgVar.a("SUB_STAGES");
        this.h = list == null ? km5.a : list;
        yzc yzcVar = new yzc();
        this.i = yzcVar;
        this.j = waa.w(yzcVar);
        uee ueeVar = uee.g;
        ueeVar.getClass();
        yzc yzcVar2 = new yzc(ueeVar);
        this.k = yzcVar2;
        this.l = waa.w(yzcVar2);
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        this.m = lm5Var;
        xw3.L(un0.z(this), null, null, new d17(this, null, 22), 3);
    }
}
