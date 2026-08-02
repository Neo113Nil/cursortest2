package com.vk.auth.ui.fastlogin;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.auth.enterphone.choosecountry.Country;
import com.vk.auth.oauth.VkOAuthService;
import com.vk.auth.ui.tertiarybutton.TertiaryButtonConfig;

/* compiled from: VkFastLoginPresenter.kt */
/* loaded from: classes15.dex */
public final class VkFastLoginPresenter$SavedState implements Parcelable {
    public static final Parcelable.Creator<VkFastLoginPresenter$SavedState> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final VkFastLoginState e;
    public final VkFastLoginState f;
    public final Country g;
    public final String h;
    public final VkOAuthService i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final TertiaryButtonConfig m;
    public final boolean n;
    public final boolean o;

    /* compiled from: VkFastLoginPresenter.kt */
    public static final class a implements Parcelable.Creator<VkFastLoginPresenter$SavedState> {
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 com.vk.auth.ui.fastlogin.VkFastLoginPresenter$SavedState, still in use, count: 2, list:
              (r1v0 com.vk.auth.ui.fastlogin.VkFastLoginPresenter$SavedState) from 0x005e: MOVE (r11v1 com.vk.auth.ui.fastlogin.VkFastLoginPresenter$SavedState) = (r1v0 com.vk.auth.ui.fastlogin.VkFastLoginPresenter$SavedState) (LINE:95)
              (r1v0 com.vk.auth.ui.fastlogin.VkFastLoginPresenter$SavedState) from 0x0059: MOVE (r11v4 com.vk.auth.ui.fastlogin.VkFastLoginPresenter$SavedState) = (r1v0 com.vk.auth.ui.fastlogin.VkFastLoginPresenter$SavedState) (LINE:90)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
            	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // android.os.Parcelable.Creator
        public final com.vk.auth.ui.fastlogin.VkFastLoginPresenter$SavedState createFromParcel(android.os.Parcel r16) {
            /*
                r15 = this;
                r0 = r16
                com.vk.auth.ui.fastlogin.VkFastLoginPresenter$SavedState r1 = new com.vk.auth.ui.fastlogin.VkFastLoginPresenter$SavedState
                r2 = r1
                java.lang.String r1 = r0.readString()
                r3 = r2
                java.lang.String r2 = r0.readString()
                r4 = r3
                java.lang.String r3 = r0.readString()
                java.lang.Class<com.vk.auth.ui.fastlogin.VkFastLoginState> r5 = com.vk.auth.ui.fastlogin.VkFastLoginState.class
                java.lang.ClassLoader r6 = r5.getClassLoader()
                android.os.Parcelable r6 = r0.readParcelable(r6)
                com.vk.auth.ui.fastlogin.VkFastLoginState r6 = (com.vk.auth.ui.fastlogin.VkFastLoginState) r6
                java.lang.ClassLoader r5 = r5.getClassLoader()
                android.os.Parcelable r5 = r0.readParcelable(r5)
                com.vk.auth.ui.fastlogin.VkFastLoginState r5 = (com.vk.auth.ui.fastlogin.VkFastLoginState) r5
                java.lang.Class<com.vk.auth.enterphone.choosecountry.Country> r7 = com.vk.auth.enterphone.choosecountry.Country.class
                java.lang.ClassLoader r7 = r7.getClassLoader()
                android.os.Parcelable r7 = r0.readParcelable(r7)
                com.vk.auth.enterphone.choosecountry.Country r7 = (com.vk.auth.enterphone.choosecountry.Country) r7
                r8 = r4
                r4 = r6
                r6 = r7
                java.lang.String r7 = r0.readString()
                com.vk.auth.oauth.VkOAuthService$a r9 = com.vk.auth.oauth.VkOAuthService.Companion
                java.lang.String r10 = r0.readString()
                r9.getClass()
                r9 = 0
                if (r10 != 0) goto L49
                goto L4d
            L49:
                com.vk.auth.oauth.VkOAuthService r9 = com.vk.auth.oauth.VkOAuthService.valueOf(r10)     // Catch: java.lang.IllegalArgumentException -> L4d
            L4d:
                java.lang.String r10 = r0.readString()
                int r11 = r0.readInt()
                r12 = 0
                r13 = 1
                if (r11 == 0) goto L5e
                r11 = r8
                r8 = r9
                r9 = r10
                r10 = r13
                goto L62
            L5e:
                r11 = r8
                r8 = r9
                r9 = r10
                r10 = r12
            L62:
                int r14 = r0.readInt()
                if (r14 == 0) goto L69
                r12 = r13
            L69:
                java.lang.Class<com.vk.auth.ui.tertiarybutton.TertiaryButtonConfig> r13 = com.vk.auth.ui.tertiarybutton.TertiaryButtonConfig.class
                java.lang.ClassLoader r13 = r13.getClassLoader()
                android.os.Parcelable r13 = r0.readParcelable(r13)
                com.vk.auth.ui.tertiarybutton.TertiaryButtonConfig r13 = (com.vk.auth.ui.tertiarybutton.TertiaryButtonConfig) r13
                r0 = r11
                r11 = r12
                r12 = r13
                boolean r13 = xsna.qxm0.v(r16)
                boolean r14 = xsna.qxm0.v(r16)
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vk.auth.ui.fastlogin.VkFastLoginPresenter$SavedState.a.createFromParcel(android.os.Parcel):java.lang.Object");
        }

        @Override // android.os.Parcelable.Creator
        public final VkFastLoginPresenter$SavedState[] newArray(int i) {
            return new VkFastLoginPresenter$SavedState[i];
        }
    }

    public VkFastLoginPresenter$SavedState(String str, String str2, String str3, VkFastLoginState vkFastLoginState, VkFastLoginState vkFastLoginState2, Country country, String str4, VkOAuthService vkOAuthService, String str5, boolean z, boolean z2, TertiaryButtonConfig tertiaryButtonConfig, boolean z3, boolean z4) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = vkFastLoginState;
        this.f = vkFastLoginState2;
        this.g = country;
        this.h = str4;
        this.i = vkOAuthService;
        this.j = str5;
        this.k = z;
        this.l = z2;
        this.m = tertiaryButtonConfig;
        this.n = z3;
        this.o = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeParcelable(this.e, 0);
        parcel.writeParcelable(this.f, 0);
        parcel.writeParcelable(this.g, 0);
        parcel.writeString(this.h);
        VkOAuthService vkOAuthService = this.i;
        parcel.writeString(vkOAuthService != null ? vkOAuthService.name() : null);
        parcel.writeString(this.j);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeParcelable(this.m, 0);
        parcel.writeByte(this.n ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.o ? (byte) 1 : (byte) 0);
    }
}
