package com.vk.clips.upload.vk.ui.impl.fragment.entity.params;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.ConditionalFeature;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.ConditionalNumber;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.DisableableFeature;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.DisableableSwitch;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.HideableFeature;
import com.vk.dto.clips.external.ClipsDraftablePlaylist;
import com.vk.dto.common.clips.ClipsLinkAttachment;
import defpackage.q0;
import xsna.epx;
import xsna.qoy;

/* compiled from: ClipsUploadAuthorRelatedData.kt */
/* loaded from: classes17.dex */
public final class ClipsUploadAuthorRelatedData implements Parcelable {
    public static final Parcelable.Creator<ClipsUploadAuthorRelatedData> CREATOR = new a();
    public final ConditionalFeature<ClipsLinkAttachment> b;
    public final ConditionalFeature<ClipsUploadPrivacyData> c;
    public final ConditionalFeature<CoauthorsData> d;
    public final HideableFeature<ClipsDraftablePlaylist> e;
    public final HideableFeature<ClipInvolvementActionButton<?>> f;
    public final ClipInvolvementActionButton<?> g;
    public final DisableableFeature<ClipAttachedVideoInfo> h;
    public final DisableableSwitch i;
    public final ConditionalNumber<Long> j;
    public final ConditionalFeature<EasyPromoteData> k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final ConditionalFeature<AutoRepostToStoriesData> q;
    public final boolean r;
    public final boolean s;

    /* compiled from: ClipsUploadAuthorRelatedData.kt */
    public static final class a implements Parcelable.Creator<ClipsUploadAuthorRelatedData> {
        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException
            */
        @Override // android.os.Parcelable.Creator
        public final com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadAuthorRelatedData createFromParcel(
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r22v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException
            */

        @Override // android.os.Parcelable.Creator
        public final ClipsUploadAuthorRelatedData[] newArray(int i) {
            return new ClipsUploadAuthorRelatedData[i];
        }
    }

    public ClipsUploadAuthorRelatedData(ConditionalFeature<ClipsLinkAttachment> conditionalFeature, ConditionalFeature<ClipsUploadPrivacyData> conditionalFeature2, ConditionalFeature<CoauthorsData> conditionalFeature3, HideableFeature<ClipsDraftablePlaylist> hideableFeature, HideableFeature<ClipInvolvementActionButton<?>> hideableFeature2, ClipInvolvementActionButton<?> clipInvolvementActionButton, DisableableFeature<ClipAttachedVideoInfo> disableableFeature, DisableableSwitch disableableSwitch, ConditionalNumber<Long> conditionalNumber, ConditionalFeature<EasyPromoteData> conditionalFeature4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ConditionalFeature<AutoRepostToStoriesData> conditionalFeature5, boolean z6, boolean z7) {
        this.b = conditionalFeature;
        this.c = conditionalFeature2;
        this.d = conditionalFeature3;
        this.e = hideableFeature;
        this.f = hideableFeature2;
        this.g = clipInvolvementActionButton;
        this.h = disableableFeature;
        this.i = disableableSwitch;
        this.j = conditionalNumber;
        this.k = conditionalFeature4;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = z4;
        this.p = z5;
        this.q = conditionalFeature5;
        this.r = z6;
        this.s = z7;
    }

    public static ClipsUploadAuthorRelatedData a(ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData, ConditionalFeature conditionalFeature, ConditionalFeature conditionalFeature2, ConditionalFeature conditionalFeature3, HideableFeature hideableFeature, HideableFeature hideableFeature2, ClipInvolvementActionButton clipInvolvementActionButton, DisableableFeature disableableFeature, DisableableSwitch disableableSwitch, ConditionalNumber conditionalNumber, ConditionalFeature conditionalFeature4, boolean z, boolean z2, boolean z3, boolean z4, ConditionalFeature conditionalFeature5, boolean z5, boolean z6, int i) {
        ConditionalFeature conditionalFeature6 = (i & 1) != 0 ? clipsUploadAuthorRelatedData.b : conditionalFeature;
        ConditionalFeature conditionalFeature7 = (i & 2) != 0 ? clipsUploadAuthorRelatedData.c : conditionalFeature2;
        ConditionalFeature conditionalFeature8 = (i & 4) != 0 ? clipsUploadAuthorRelatedData.d : conditionalFeature3;
        HideableFeature hideableFeature3 = (i & 8) != 0 ? clipsUploadAuthorRelatedData.e : hideableFeature;
        HideableFeature hideableFeature4 = (i & 16) != 0 ? clipsUploadAuthorRelatedData.f : hideableFeature2;
        ClipInvolvementActionButton clipInvolvementActionButton2 = (i & 32) != 0 ? clipsUploadAuthorRelatedData.g : clipInvolvementActionButton;
        DisableableFeature disableableFeature2 = (i & 64) != 0 ? clipsUploadAuthorRelatedData.h : disableableFeature;
        DisableableSwitch disableableSwitch2 = (i & 128) != 0 ? clipsUploadAuthorRelatedData.i : disableableSwitch;
        ConditionalNumber conditionalNumber2 = (i & 256) != 0 ? clipsUploadAuthorRelatedData.j : conditionalNumber;
        ConditionalFeature conditionalFeature9 = (i & 512) != 0 ? clipsUploadAuthorRelatedData.k : conditionalFeature4;
        boolean z7 = (i & 1024) != 0 ? clipsUploadAuthorRelatedData.l : false;
        boolean z8 = (i & 2048) != 0 ? clipsUploadAuthorRelatedData.m : z;
        boolean z9 = (i & 4096) != 0 ? clipsUploadAuthorRelatedData.n : z2;
        boolean z10 = (i & 8192) != 0 ? clipsUploadAuthorRelatedData.o : z3;
        ConditionalFeature conditionalFeature10 = conditionalFeature6;
        boolean z11 = (i & 16384) != 0 ? clipsUploadAuthorRelatedData.p : z4;
        ConditionalFeature conditionalFeature11 = (i & 32768) != 0 ? clipsUploadAuthorRelatedData.q : conditionalFeature5;
        boolean z12 = (i & 65536) != 0 ? clipsUploadAuthorRelatedData.r : z5;
        boolean z13 = (i & 131072) != 0 ? clipsUploadAuthorRelatedData.s : z6;
        clipsUploadAuthorRelatedData.getClass();
        return new ClipsUploadAuthorRelatedData(conditionalFeature10, conditionalFeature7, conditionalFeature8, hideableFeature3, hideableFeature4, clipInvolvementActionButton2, disableableFeature2, disableableSwitch2, conditionalNumber2, conditionalFeature9, z7, z8, z9, z10, z11, conditionalFeature11, z12, z13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsUploadAuthorRelatedData)) {
            return false;
        }
        ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData = (ClipsUploadAuthorRelatedData) obj;
        return epx.f(this.b, clipsUploadAuthorRelatedData.b) && epx.f(this.c, clipsUploadAuthorRelatedData.c) && epx.f(this.d, clipsUploadAuthorRelatedData.d) && epx.f(this.e, clipsUploadAuthorRelatedData.e) && epx.f(this.f, clipsUploadAuthorRelatedData.f) && epx.f(this.g, clipsUploadAuthorRelatedData.g) && epx.f(this.h, clipsUploadAuthorRelatedData.h) && epx.f(this.i, clipsUploadAuthorRelatedData.i) && epx.f(this.j, clipsUploadAuthorRelatedData.j) && epx.f(this.k, clipsUploadAuthorRelatedData.k) && this.l == clipsUploadAuthorRelatedData.l && this.m == clipsUploadAuthorRelatedData.m && this.n == clipsUploadAuthorRelatedData.n && this.o == clipsUploadAuthorRelatedData.o && this.p == clipsUploadAuthorRelatedData.p && epx.f(this.q, clipsUploadAuthorRelatedData.q) && this.r == clipsUploadAuthorRelatedData.r && this.s == clipsUploadAuthorRelatedData.s;
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        ClipInvolvementActionButton<?> clipInvolvementActionButton = this.g;
        return Boolean.hashCode(this.s) + qoy.b((this.q.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((hashCode + (clipInvolvementActionButton == null ? 0 : clipInvolvementActionButton.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p)) * 31, 31, this.r);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsUploadAuthorRelatedData(linkAttachment=");
        sb.append(this.b);
        sb.append(", privacyData=");
        sb.append(this.c);
        sb.append(", coauthorsAttachment=");
        sb.append(this.d);
        sb.append(", playlist=");
        sb.append(this.e);
        sb.append(", involvementAttachment=");
        sb.append(this.f);
        sb.append(", singleAvailableAttachOrNull=");
        sb.append(this.g);
        sb.append(", videoAttachment=");
        sb.append(this.h);
        sb.append(", postToWall=");
        sb.append(this.i);
        sb.append(", publicationDateMs=");
        sb.append(this.j);
        sb.append(", easyPromoteData=");
        sb.append(this.k);
        sb.append(", redirectBannerVisible=");
        sb.append(this.l);
        sb.append(", isPostToMainTabAvailable=");
        sb.append(this.m);
        sb.append(", isPostToMainTabOnboardingAvailable=");
        sb.append(this.n);
        sb.append(", isPostToMainTabOnboardingAnimationEnd=");
        sb.append(this.o);
        sb.append(", isPostToUserMainTab=");
        sb.append(this.p);
        sb.append(", autoRepostToStory=");
        sb.append(this.q);
        sb.append(", isNeedUpProductsAttach=");
        sb.append(this.r);
        sb.append(", isTicketOnboardingAvailable=");
        return q0.a(sb, this.s, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.b.writeToParcel(parcel, i);
        this.c.writeToParcel(parcel, i);
        this.d.writeToParcel(parcel, i);
        this.e.writeToParcel(parcel, i);
        this.f.writeToParcel(parcel, i);
        parcel.writeParcelable(this.g, i);
        this.h.writeToParcel(parcel, i);
        this.i.writeToParcel(parcel, i);
        this.j.writeToParcel(parcel, i);
        this.k.writeToParcel(parcel, i);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeInt(this.n ? 1 : 0);
        parcel.writeInt(this.o ? 1 : 0);
        parcel.writeInt(this.p ? 1 : 0);
        this.q.writeToParcel(parcel, i);
        parcel.writeInt(this.r ? 1 : 0);
        parcel.writeInt(this.s ? 1 : 0);
    }
}
