package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AuthGetAuthDataSettingsDto.kt */
/* loaded from: classes14.dex */
public final class AuthGetAuthDataSettingsDto implements Parcelable {
    public static final Parcelable.Creator<AuthGetAuthDataSettingsDto> CREATOR = new a();

    @pmi0("action")
    private final String action;

    @pmi0("allow_separate_registration")
    private final boolean allowSeparateRegistration;

    @pmi0("allowed_query")
    private final List<String> allowedQuery;

    @pmi0("backgrounds")
    private final AuthGetAuthDataSettingsBackgroundsDto backgrounds;

    @pmi0("base_country")
    private final AuthGetAuthDataSettingsBaseCountryDto baseCountry;

    @pmi0("is_carousel")
    private final boolean isCarousel;

    @pmi0("is_email_reg_allowed")
    private final boolean isEmailRegAllowed;

    @pmi0(X3.a.t)
    private final String mode;

    @pmi0("mode_redirect_post")
    private final boolean modeRedirectPost;

    @pmi0("redirect")
    private final AuthGetAuthDataSettingsRedirectDto redirect;

    @pmi0("restore")
    private final AuthGetAuthDataSettingsRestoreDto restore;

    @pmi0("sferum_logo")
    private final boolean sferumLogo;

    @pmi0("show_email_login")
    private final boolean showEmailLogin;

    @pmi0("show_migration_disclaimer")
    private final boolean showMigrationDisclaimer;

    @pmi0("skin")
    private final AuthGetAuthDataSettingsSkinDto skin;

    @pmi0("support_mweb_redirect")
    private final boolean supportMwebRedirect;

    /* compiled from: AuthGetAuthDataSettingsDto.kt */
    public static final class a implements Parcelable.Creator<AuthGetAuthDataSettingsDto> {
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 com.vk.api.generated.auth.dto.AuthGetAuthDataSettingsDto, still in use, count: 2, list:
              (r1v0 com.vk.api.generated.auth.dto.AuthGetAuthDataSettingsDto) from 0x0014: MOVE (r3v1 com.vk.api.generated.auth.dto.AuthGetAuthDataSettingsDto) = (r1v0 com.vk.api.generated.auth.dto.AuthGetAuthDataSettingsDto) (LINE:21)
              (r1v0 com.vk.api.generated.auth.dto.AuthGetAuthDataSettingsDto) from 0x0011: MOVE (r3v6 com.vk.api.generated.auth.dto.AuthGetAuthDataSettingsDto) = (r1v0 com.vk.api.generated.auth.dto.AuthGetAuthDataSettingsDto) (LINE:18)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
            	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // android.os.Parcelable.Creator
        public final com.vk.api.generated.auth.dto.AuthGetAuthDataSettingsDto createFromParcel(android.os.Parcel r20) {
            /*
                r19 = this;
                r0 = r20
                com.vk.api.generated.auth.dto.AuthGetAuthDataSettingsDto r1 = new com.vk.api.generated.auth.dto.AuthGetAuthDataSettingsDto
                r2 = r1
                java.lang.String r1 = r0.readString()
                int r3 = r0.readInt()
                r4 = 0
                r5 = 1
                if (r3 == 0) goto L14
                r3 = r2
                r2 = r5
                goto L16
            L14:
                r3 = r2
                r2 = r4
            L16:
                java.util.ArrayList r6 = r0.createStringArrayList()
                android.os.Parcelable$Creator<com.vk.api.generated.auth.dto.AuthGetAuthDataSettingsSkinDto> r7 = com.vk.api.generated.auth.dto.AuthGetAuthDataSettingsSkinDto.CREATOR
                java.lang.Object r7 = r7.createFromParcel(r0)
                com.vk.api.generated.auth.dto.AuthGetAuthDataSettingsSkinDto r7 = (com.vk.api.generated.auth.dto.AuthGetAuthDataSettingsSkinDto) r7
                r8 = r5
                java.lang.String r5 = r0.readString()
                android.os.Parcelable$Creator<com.vk.api.generated.auth.dto.AuthGetAuthDataSettingsRedirectDto> r9 = com.vk.api.generated.auth.dto.AuthGetAuthDataSettingsRedirectDto.CREATOR
                java.lang.Object r9 = r9.createFromParcel(r0)
                com.vk.api.generated.auth.dto.AuthGetAuthDataSettingsRedirectDto r9 = (com.vk.api.generated.auth.dto.AuthGetAuthDataSettingsRedirectDto) r9
                android.os.Parcelable$Creator<com.vk.api.generated.auth.dto.AuthGetAuthDataSettingsRestoreDto> r10 = com.vk.api.generated.auth.dto.AuthGetAuthDataSettingsRestoreDto.CREATOR
                java.lang.Object r10 = r10.createFromParcel(r0)
                com.vk.api.generated.auth.dto.AuthGetAuthDataSettingsRestoreDto r10 = (com.vk.api.generated.auth.dto.AuthGetAuthDataSettingsRestoreDto) r10
                int r11 = r0.readInt()
                if (r11 == 0) goto L3f
                r11 = r8
                goto L41
            L3f:
                r11 = r8
                r8 = r4
            L41:
                int r12 = r0.readInt()
                if (r12 == 0) goto L4c
                r12 = r3
                r3 = r6
                r6 = r9
                r9 = r11
                goto L50
            L4c:
                r12 = r3
                r3 = r6
                r6 = r9
                r9 = r4
            L50:
                int r13 = r0.readInt()
                if (r13 == 0) goto L5b
                r13 = r4
                r4 = r7
                r7 = r10
                r10 = r11
                goto L5f
            L5b:
                r13 = r4
                r4 = r7
                r7 = r10
                r10 = r13
            L5f:
                int r14 = r0.readInt()
                if (r14 == 0) goto L67
                r14 = r11
                goto L69
            L67:
                r14 = r11
                r11 = r13
            L69:
                android.os.Parcelable$Creator<com.vk.api.generated.auth.dto.AuthGetAuthDataSettingsBaseCountryDto> r15 = com.vk.api.generated.auth.dto.AuthGetAuthDataSettingsBaseCountryDto.CREATOR
                java.lang.Object r15 = r15.createFromParcel(r0)
                com.vk.api.generated.auth.dto.AuthGetAuthDataSettingsBaseCountryDto r15 = (com.vk.api.generated.auth.dto.AuthGetAuthDataSettingsBaseCountryDto) r15
                int r16 = r0.readInt()
                if (r16 == 0) goto L7b
                r16 = r13
                r13 = r14
                goto L7d
            L7b:
                r16 = r13
            L7d:
                int r17 = r0.readInt()
                if (r17 == 0) goto L86
                r17 = r14
                goto L8a
            L86:
                r17 = r14
                r14 = r16
            L8a:
                int r18 = r0.readInt()
                if (r18 == 0) goto L92
                r16 = r17
            L92:
                int r17 = r0.readInt()
                if (r17 != 0) goto L9c
                r0 = 0
                r17 = r1
                goto La4
            L9c:
                r17 = r1
                android.os.Parcelable$Creator<com.vk.api.generated.auth.dto.AuthGetAuthDataSettingsBackgroundsDto> r1 = com.vk.api.generated.auth.dto.AuthGetAuthDataSettingsBackgroundsDto.CREATOR
                java.lang.Object r0 = r1.createFromParcel(r0)
            La4:
                com.vk.api.generated.auth.dto.AuthGetAuthDataSettingsBackgroundsDto r0 = (com.vk.api.generated.auth.dto.AuthGetAuthDataSettingsBackgroundsDto) r0
                r1 = r16
                r16 = r0
                r0 = r12
                r12 = r15
                r15 = r1
                r1 = r17
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vk.api.generated.auth.dto.AuthGetAuthDataSettingsDto.a.createFromParcel(android.os.Parcel):java.lang.Object");
        }

        @Override // android.os.Parcelable.Creator
        public final AuthGetAuthDataSettingsDto[] newArray(int i) {
            return new AuthGetAuthDataSettingsDto[i];
        }
    }

    public AuthGetAuthDataSettingsDto(String str, boolean z, List<String> list, AuthGetAuthDataSettingsSkinDto authGetAuthDataSettingsSkinDto, String str2, AuthGetAuthDataSettingsRedirectDto authGetAuthDataSettingsRedirectDto, AuthGetAuthDataSettingsRestoreDto authGetAuthDataSettingsRestoreDto, boolean z2, boolean z3, boolean z4, boolean z5, AuthGetAuthDataSettingsBaseCountryDto authGetAuthDataSettingsBaseCountryDto, boolean z6, boolean z7, boolean z8, AuthGetAuthDataSettingsBackgroundsDto authGetAuthDataSettingsBackgroundsDto) {
        this.mode = str;
        this.modeRedirectPost = z;
        this.allowedQuery = list;
        this.skin = authGetAuthDataSettingsSkinDto;
        this.action = str2;
        this.redirect = authGetAuthDataSettingsRedirectDto;
        this.restore = authGetAuthDataSettingsRestoreDto;
        this.isCarousel = z2;
        this.isEmailRegAllowed = z3;
        this.showEmailLogin = z4;
        this.sferumLogo = z5;
        this.baseCountry = authGetAuthDataSettingsBaseCountryDto;
        this.supportMwebRedirect = z6;
        this.allowSeparateRegistration = z7;
        this.showMigrationDisclaimer = z8;
        this.backgrounds = authGetAuthDataSettingsBackgroundsDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthGetAuthDataSettingsDto)) {
            return false;
        }
        AuthGetAuthDataSettingsDto authGetAuthDataSettingsDto = (AuthGetAuthDataSettingsDto) obj;
        return epx.f(this.mode, authGetAuthDataSettingsDto.mode) && this.modeRedirectPost == authGetAuthDataSettingsDto.modeRedirectPost && epx.f(this.allowedQuery, authGetAuthDataSettingsDto.allowedQuery) && epx.f(this.skin, authGetAuthDataSettingsDto.skin) && epx.f(this.action, authGetAuthDataSettingsDto.action) && epx.f(this.redirect, authGetAuthDataSettingsDto.redirect) && epx.f(this.restore, authGetAuthDataSettingsDto.restore) && this.isCarousel == authGetAuthDataSettingsDto.isCarousel && this.isEmailRegAllowed == authGetAuthDataSettingsDto.isEmailRegAllowed && this.showEmailLogin == authGetAuthDataSettingsDto.showEmailLogin && this.sferumLogo == authGetAuthDataSettingsDto.sferumLogo && epx.f(this.baseCountry, authGetAuthDataSettingsDto.baseCountry) && this.supportMwebRedirect == authGetAuthDataSettingsDto.supportMwebRedirect && this.allowSeparateRegistration == authGetAuthDataSettingsDto.allowSeparateRegistration && this.showMigrationDisclaimer == authGetAuthDataSettingsDto.showMigrationDisclaimer && epx.f(this.backgrounds, authGetAuthDataSettingsDto.backgrounds);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b((this.baseCountry.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b((this.restore.hashCode() + ((this.redirect.hashCode() + urd0.a((this.skin.hashCode() + fw3.a(qoy.b(this.mode.hashCode() * 31, 31, this.modeRedirectPost), 31, this.allowedQuery)) * 31, 31, this.action)) * 31)) * 31, 31, this.isCarousel), 31, this.isEmailRegAllowed), 31, this.showEmailLogin), 31, this.sferumLogo)) * 31, 31, this.supportMwebRedirect), 31, this.allowSeparateRegistration), 31, this.showMigrationDisclaimer);
        AuthGetAuthDataSettingsBackgroundsDto authGetAuthDataSettingsBackgroundsDto = this.backgrounds;
        return b + (authGetAuthDataSettingsBackgroundsDto == null ? 0 : authGetAuthDataSettingsBackgroundsDto.hashCode());
    }

    public final String toString() {
        return "AuthGetAuthDataSettingsDto(mode=" + this.mode + ", modeRedirectPost=" + this.modeRedirectPost + ", allowedQuery=" + this.allowedQuery + ", skin=" + this.skin + ", action=" + this.action + ", redirect=" + this.redirect + ", restore=" + this.restore + ", isCarousel=" + this.isCarousel + ", isEmailRegAllowed=" + this.isEmailRegAllowed + ", showEmailLogin=" + this.showEmailLogin + ", sferumLogo=" + this.sferumLogo + ", baseCountry=" + this.baseCountry + ", supportMwebRedirect=" + this.supportMwebRedirect + ", allowSeparateRegistration=" + this.allowSeparateRegistration + ", showMigrationDisclaimer=" + this.showMigrationDisclaimer + ", backgrounds=" + this.backgrounds + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mode);
        parcel.writeInt(this.modeRedirectPost ? 1 : 0);
        parcel.writeStringList(this.allowedQuery);
        this.skin.writeToParcel(parcel, i);
        parcel.writeString(this.action);
        this.redirect.writeToParcel(parcel, i);
        this.restore.writeToParcel(parcel, i);
        parcel.writeInt(this.isCarousel ? 1 : 0);
        parcel.writeInt(this.isEmailRegAllowed ? 1 : 0);
        parcel.writeInt(this.showEmailLogin ? 1 : 0);
        parcel.writeInt(this.sferumLogo ? 1 : 0);
        this.baseCountry.writeToParcel(parcel, i);
        parcel.writeInt(this.supportMwebRedirect ? 1 : 0);
        parcel.writeInt(this.allowSeparateRegistration ? 1 : 0);
        parcel.writeInt(this.showMigrationDisclaimer ? 1 : 0);
        AuthGetAuthDataSettingsBackgroundsDto authGetAuthDataSettingsBackgroundsDto = this.backgrounds;
        if (authGetAuthDataSettingsBackgroundsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authGetAuthDataSettingsBackgroundsDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AuthGetAuthDataSettingsDto(String str, boolean z, List list, AuthGetAuthDataSettingsSkinDto authGetAuthDataSettingsSkinDto, String str2, AuthGetAuthDataSettingsRedirectDto authGetAuthDataSettingsRedirectDto, AuthGetAuthDataSettingsRestoreDto authGetAuthDataSettingsRestoreDto, boolean z2, boolean z3, boolean z4, boolean z5, AuthGetAuthDataSettingsBaseCountryDto authGetAuthDataSettingsBaseCountryDto, boolean z6, boolean z7, boolean z8, AuthGetAuthDataSettingsBackgroundsDto authGetAuthDataSettingsBackgroundsDto, int i, zcl zclVar) {
        this(str, z, list, authGetAuthDataSettingsSkinDto, str2, authGetAuthDataSettingsRedirectDto, authGetAuthDataSettingsRestoreDto, z2, z3, z4, z5, authGetAuthDataSettingsBaseCountryDto, z6, z7, z8, (i & 32768) != 0 ? null : authGetAuthDataSettingsBackgroundsDto);
    }
}
