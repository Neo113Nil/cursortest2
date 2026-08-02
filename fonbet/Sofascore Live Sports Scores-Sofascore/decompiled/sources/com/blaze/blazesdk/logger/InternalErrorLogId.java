package com.blaze.blazesdk.logger;

import androidx.annotation.Keep;
import com.ironsource.U3;
import defpackage.gz8;
import defpackage.jp5;
import defpackage.p0m;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/blaze/blazesdk/logger/InternalErrorLogId;", "Lp0m;", "", "", "defaultMessage", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getDefaultMessage", "()Ljava/lang/String;", U3.i.X, "getValue", "UNEXPECTED", "APPLICATION_NOT_INITIALIZED", "INVALID_GEO_CODE", "INVALID_APP_CONFIG", "FAILED_FETCHING_CONTENT", "FAILED_TO_LOAD_IMAGE_ASSET", "FAILED_TO_LOAD_VIDEO_ASSET", "FAILED_TO_SAVE_DATA", "FAILED_LAUNCHING_SHARE_INTENT", "FAILED_CREATING_LINK", "PLAYBACK_CONFIGURATIONS_INVALID_LOOP_AND_ADVANCE_CONFIGURATION", "PIP_FAILED_TO_ENTER", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InternalErrorLogId implements p0m {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ InternalErrorLogId[] $VALUES;

    @NotNull
    private final String defaultMessage;

    @NotNull
    private final String value = "Android_internal_error_" + name();
    public static final InternalErrorLogId UNEXPECTED = new InternalErrorLogId("UNEXPECTED", 0, "An unexpected error occurred:");
    public static final InternalErrorLogId APPLICATION_NOT_INITIALIZED = new InternalErrorLogId("APPLICATION_NOT_INITIALIZED", 1, "Application not properly initialized:");
    public static final InternalErrorLogId INVALID_GEO_CODE = new InternalErrorLogId("INVALID_GEO_CODE", 2, "Invalid geo code provided:");
    public static final InternalErrorLogId INVALID_APP_CONFIG = new InternalErrorLogId("INVALID_APP_CONFIG", 3, "Failed to fetch app configuration:");
    public static final InternalErrorLogId FAILED_FETCHING_CONTENT = new InternalErrorLogId("FAILED_FETCHING_CONTENT", 4, "Failed to fetch content:");
    public static final InternalErrorLogId FAILED_TO_LOAD_IMAGE_ASSET = new InternalErrorLogId("FAILED_TO_LOAD_IMAGE_ASSET", 5, "Failed to load image asset:");
    public static final InternalErrorLogId FAILED_TO_LOAD_VIDEO_ASSET = new InternalErrorLogId("FAILED_TO_LOAD_VIDEO_ASSET", 6, "Failed to load video asset:");
    public static final InternalErrorLogId FAILED_TO_SAVE_DATA = new InternalErrorLogId("FAILED_TO_SAVE_DATA", 7, "Failed to save data:");
    public static final InternalErrorLogId FAILED_LAUNCHING_SHARE_INTENT = new InternalErrorLogId("FAILED_LAUNCHING_SHARE_INTENT", 8, "Failed to launch share intent:");
    public static final InternalErrorLogId FAILED_CREATING_LINK = new InternalErrorLogId("FAILED_CREATING_LINK", 9, "Failed to create shareable link:");
    public static final InternalErrorLogId PLAYBACK_CONFIGURATIONS_INVALID_LOOP_AND_ADVANCE_CONFIGURATION = new InternalErrorLogId("PLAYBACK_CONFIGURATIONS_INVALID_LOOP_AND_ADVANCE_CONFIGURATION", 10, "Invalid LoopAndAdvance configuration:");
    public static final InternalErrorLogId PIP_FAILED_TO_ENTER = new InternalErrorLogId("PIP_FAILED_TO_ENTER", 11, "Failed to enter PIP mode:");

    private static final /* synthetic */ InternalErrorLogId[] $values() {
        return new InternalErrorLogId[]{UNEXPECTED, APPLICATION_NOT_INITIALIZED, INVALID_GEO_CODE, INVALID_APP_CONFIG, FAILED_FETCHING_CONTENT, FAILED_TO_LOAD_IMAGE_ASSET, FAILED_TO_LOAD_VIDEO_ASSET, FAILED_TO_SAVE_DATA, FAILED_LAUNCHING_SHARE_INTENT, FAILED_CREATING_LINK, PLAYBACK_CONFIGURATIONS_INVALID_LOOP_AND_ADVANCE_CONFIGURATION, PIP_FAILED_TO_ENTER};
    }

    static {
        InternalErrorLogId[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private InternalErrorLogId(String str, int i, String str2) {
        this.defaultMessage = str2;
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static InternalErrorLogId valueOf(String str) {
        return (InternalErrorLogId) Enum.valueOf(InternalErrorLogId.class, str);
    }

    public static InternalErrorLogId[] values() {
        return (InternalErrorLogId[]) $VALUES.clone();
    }

    @Override // defpackage.p0m
    @NotNull
    public String getDefaultMessage() {
        return this.defaultMessage;
    }

    @Override // defpackage.p0m
    @NotNull
    public String getValue() {
        return this.value;
    }
}
