package com.unity3d.mediation;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.fc6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class LevelPlayAdError {

    @NotNull
    public static final a Companion = new a(null);
    public static final int ERROR_CODE_INVALID_AD_UNIT_ID = 626;
    public static final int ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK = 625;
    public static final int ERROR_CODE_LOAD_FAILED_ALREADY_CALLED = 627;
    public static final int ERROR_CODE_LOAD_WHILE_SHOW = 629;
    public static final int ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED = 624;
    public static final int ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK = 628;
    public static final int ERROR_CODE_SHOW_WHILE_LOAD = 631;
    public static final int ERROR_CODE_SHOW_WHILE_SHOW = 630;

    @Nullable
    private final IronSourceError a;

    @NotNull
    private final String b;

    @Nullable
    private final String c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayAdError(@NotNull String str, @NotNull String str2, int i, @NotNull String str3) {
        this(new IronSourceError(i, str3), str, str2);
        str.getClass();
        str2.getClass();
        str3.getClass();
    }

    @NotNull
    public final String getAdId() {
        return this.b;
    }

    @Nullable
    public final String getAdUnitId() {
        return this.c;
    }

    public final int getErrorCode() {
        IronSourceError ironSourceError = this.a;
        if (ironSourceError != null) {
            return ironSourceError.getErrorCode();
        }
        return 0;
    }

    @NotNull
    public final String getErrorMessage() {
        IronSourceError ironSourceError = this.a;
        String errorMessage = ironSourceError != null ? ironSourceError.getErrorMessage() : null;
        return errorMessage == null ? "" : errorMessage;
    }

    @NotNull
    public String toString() {
        String str = this.c;
        IronSourceError ironSourceError = this.a;
        return fc6.n("adUnitId: ", str, " ", ironSourceError != null ? ironSourceError.toString() : null);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ LevelPlayAdError(IronSourceError ironSourceError, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ironSourceError, str, (i & 4) != 0 ? null : str2);
    }

    public LevelPlayAdError(@Nullable IronSourceError ironSourceError, @NotNull String str, @Nullable String str2) {
        str.getClass();
        this.a = ironSourceError;
        this.b = str;
        this.c = str2;
    }
}
