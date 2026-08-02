package com.vk.video.ui.upload.impl.settings.presentation.feature.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.VideoFile;
import com.vk.dto.stories.entities.OrdData;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.g9k0;
import xsna.lm50;
import xsna.qoy;
import xsna.sn;

/* compiled from: SettingsState.kt */
/* loaded from: classes7.dex */
public final class SettingsState implements lm50, Parcelable {
    public static final Parcelable.Creator<SettingsState> CREATOR = new a();
    public final List<VideoFile> b;
    public final boolean c;
    public final VkOnboardingCampaign d;
    public final VkOnboardingStat$Delegate e;
    public final Boolean f;
    public final Boolean g;
    public final Boolean h;
    public final OrdData i;
    public final g9k0 j;

    /* compiled from: SettingsState.kt */
    public static final class a implements Parcelable.Creator<SettingsState> {
        @Override // android.os.Parcelable.Creator
        public final SettingsState createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(SettingsState.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            boolean z = parcel.readInt() != 0;
            VkOnboardingCampaign vkOnboardingCampaign = (VkOnboardingCampaign) parcel.readParcelable(SettingsState.class.getClassLoader());
            VkOnboardingStat$Delegate vkOnboardingStat$Delegate = (VkOnboardingStat$Delegate) parcel.readParcelable(SettingsState.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SettingsState(arrayList, z, vkOnboardingCampaign, vkOnboardingStat$Delegate, valueOf, valueOf2, bool, (OrdData) parcel.readParcelable(SettingsState.class.getClassLoader()), null, 256, null);
        }

        @Override // android.os.Parcelable.Creator
        public final SettingsState[] newArray(int i) {
            return new SettingsState[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SettingsState(List<? extends VideoFile> list, boolean z, VkOnboardingCampaign vkOnboardingCampaign, VkOnboardingStat$Delegate vkOnboardingStat$Delegate, Boolean bool, Boolean bool2, Boolean bool3, OrdData ordData, g9k0 g9k0Var) {
        this.b = list;
        this.c = z;
        this.d = vkOnboardingCampaign;
        this.e = vkOnboardingStat$Delegate;
        this.f = bool;
        this.g = bool2;
        this.h = bool3;
        this.i = ordData;
        this.j = g9k0Var;
    }

    public static SettingsState a(SettingsState settingsState, List list, boolean z, VkOnboardingCampaign vkOnboardingCampaign, VkOnboardingStat$Delegate vkOnboardingStat$Delegate, Boolean bool, Boolean bool2, Boolean bool3, OrdData ordData, g9k0 g9k0Var, int i) {
        if ((i & 1) != 0) {
            list = settingsState.b;
        }
        List list2 = list;
        if ((i & 2) != 0) {
            z = settingsState.c;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            vkOnboardingCampaign = settingsState.d;
        }
        VkOnboardingCampaign vkOnboardingCampaign2 = vkOnboardingCampaign;
        if ((i & 8) != 0) {
            vkOnboardingStat$Delegate = settingsState.e;
        }
        VkOnboardingStat$Delegate vkOnboardingStat$Delegate2 = vkOnboardingStat$Delegate;
        if ((i & 16) != 0) {
            bool = settingsState.f;
        }
        Boolean bool4 = bool;
        Boolean bool5 = (i & 32) != 0 ? settingsState.g : bool2;
        Boolean bool6 = (i & 64) != 0 ? settingsState.h : bool3;
        OrdData ordData2 = (i & 128) != 0 ? settingsState.i : ordData;
        g9k0 g9k0Var2 = (i & 256) != 0 ? settingsState.j : g9k0Var;
        settingsState.getClass();
        return new SettingsState(list2, z2, vkOnboardingCampaign2, vkOnboardingStat$Delegate2, bool4, bool5, bool6, ordData2, g9k0Var2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SettingsState)) {
            return false;
        }
        SettingsState settingsState = (SettingsState) obj;
        return epx.f(this.b, settingsState.b) && this.c == settingsState.c && epx.f(this.d, settingsState.d) && epx.f(this.e, settingsState.e) && epx.f(this.f, settingsState.f) && epx.f(this.g, settingsState.g) && epx.f(this.h, settingsState.h) && epx.f(this.i, settingsState.i) && epx.f(this.j, settingsState.j);
    }

    public final int hashCode() {
        List<VideoFile> list = this.b;
        int b = qoy.b((list == null ? 0 : list.hashCode()) * 31, 31, this.c);
        VkOnboardingCampaign vkOnboardingCampaign = this.d;
        int hashCode = (b + (vkOnboardingCampaign == null ? 0 : vkOnboardingCampaign.hashCode())) * 31;
        VkOnboardingStat$Delegate vkOnboardingStat$Delegate = this.e;
        int hashCode2 = (hashCode + (vkOnboardingStat$Delegate == null ? 0 : vkOnboardingStat$Delegate.hashCode())) * 31;
        Boolean bool = this.f;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.g;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.h;
        int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        OrdData ordData = this.i;
        int hashCode6 = (hashCode5 + (ordData == null ? 0 : ordData.hashCode())) * 31;
        g9k0 g9k0Var = this.j;
        return hashCode6 + (g9k0Var != null ? g9k0Var.hashCode() : 0);
    }

    public final String toString() {
        return "SettingsState(attachedClips=" + this.b + ", isAttachedClipsOnboardingVisible=" + this.c + ", attachedClipsOnboardingCampaign=" + this.d + ", attachedClipsOnboardingStatDelegate=" + this.e + ", isVideoCompressionEnabled=" + this.f + ", isCommunityPostEnabled=" + this.g + ", isUserPostEnabled=" + this.h + ", ordData=" + this.i + ", snackbar=" + this.j + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<VideoFile> list = this.b;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
        Boolean bool = this.f;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.g;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.h;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        parcel.writeParcelable(this.i, i);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ SettingsState(java.util.List r11, boolean r12, com.vk.onboarding.api.dto.VkOnboardingCampaign r13, com.vk.onboarding.api.stat.VkOnboardingStat$Delegate r14, java.lang.Boolean r15, java.lang.Boolean r16, java.lang.Boolean r17, com.vk.dto.stories.entities.OrdData r18, xsna.g9k0 r19, int r20, xsna.zcl r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 2
            if (r1 == 0) goto L7
            r12 = 0
        L7:
            r2 = r12
            r12 = r0 & 4
            r1 = 0
            if (r12 == 0) goto Lf
            r3 = r1
            goto L10
        Lf:
            r3 = r13
        L10:
            r12 = r0 & 8
            if (r12 == 0) goto L16
            r4 = r1
            goto L17
        L16:
            r4 = r14
        L17:
            r12 = r0 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L26
            r9 = r1
            r0 = r10
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r1 = r11
            goto L31
        L26:
            r9 = r19
            r0 = r10
            r1 = r11
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
        L31:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.video.ui.upload.impl.settings.presentation.feature.entity.SettingsState.<init>(java.util.List, boolean, com.vk.onboarding.api.dto.VkOnboardingCampaign, com.vk.onboarding.api.stat.VkOnboardingStat$Delegate, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, com.vk.dto.stories.entities.OrdData, xsna.g9k0, int, xsna.zcl):void");
    }
}
