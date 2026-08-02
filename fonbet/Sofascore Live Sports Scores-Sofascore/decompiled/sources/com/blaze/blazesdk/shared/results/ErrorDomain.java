package com.blaze.blazesdk.shared.results;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.ironsource.U3;
import com.sofascore.model.network.response.SearchResponseKt;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u001f"}, d2 = {"Lcom/blaze/blazesdk/shared/results/ErrorDomain;", "Landroid/os/Parcelable;", "", U3.i.X, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "INITIALIZATION", "USER_MANAGEMENT", "DATA_STORAGE", "CONTENT_PREPARATION", "WIDGET", "ENTRY_POINT", "PLAYER", "GENERAL", "UNIVERSAL_LINK", "CONTAINER", "CONTAINER_TABS", "PUSH", "SHARING", "PLAYBACK_CONFIGURATIONS", "PIP", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ErrorDomain implements Parcelable {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ ErrorDomain[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<ErrorDomain> CREATOR;

    @NotNull
    private final String value;
    public static final ErrorDomain INITIALIZATION = new ErrorDomain("INITIALIZATION", 0, GatewayException.GATEWAY_RESPONSE_DEPTH_INITIALIZATION);
    public static final ErrorDomain USER_MANAGEMENT = new ErrorDomain("USER_MANAGEMENT", 1, "userManagement");
    public static final ErrorDomain DATA_STORAGE = new ErrorDomain("DATA_STORAGE", 2, "dataStorage");
    public static final ErrorDomain CONTENT_PREPARATION = new ErrorDomain("CONTENT_PREPARATION", 3, "contentPreparation");
    public static final ErrorDomain WIDGET = new ErrorDomain("WIDGET", 4, "widget");
    public static final ErrorDomain ENTRY_POINT = new ErrorDomain("ENTRY_POINT", 5, "entryPoint");
    public static final ErrorDomain PLAYER = new ErrorDomain("PLAYER", 6, SearchResponseKt.PLAYER_ENTITY);
    public static final ErrorDomain GENERAL = new ErrorDomain("GENERAL", 7, "general");
    public static final ErrorDomain UNIVERSAL_LINK = new ErrorDomain("UNIVERSAL_LINK", 8, "universalLink");
    public static final ErrorDomain CONTAINER = new ErrorDomain("CONTAINER", 9, "container");
    public static final ErrorDomain CONTAINER_TABS = new ErrorDomain("CONTAINER_TABS", 10, "containerTabs");
    public static final ErrorDomain PUSH = new ErrorDomain("PUSH", 11, "push");
    public static final ErrorDomain SHARING = new ErrorDomain("SHARING", 12, "sharing");
    public static final ErrorDomain PLAYBACK_CONFIGURATIONS = new ErrorDomain("PLAYBACK_CONFIGURATIONS", 13, "playbackConfigurations");
    public static final ErrorDomain PIP = new ErrorDomain("PIP", 14, "pip");

    private static final /* synthetic */ ErrorDomain[] $values() {
        return new ErrorDomain[]{INITIALIZATION, USER_MANAGEMENT, DATA_STORAGE, CONTENT_PREPARATION, WIDGET, ENTRY_POINT, PLAYER, GENERAL, UNIVERSAL_LINK, CONTAINER, CONTAINER_TABS, PUSH, SHARING, PLAYBACK_CONFIGURATIONS, PIP};
    }

    static {
        ErrorDomain[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        CREATOR = new Parcelable.Creator() { // from class: com.blaze.blazesdk.shared.results.ErrorDomain.a
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return ErrorDomain.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ErrorDomain[i];
            }
        };
    }

    private ErrorDomain(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static ErrorDomain valueOf(String str) {
        return (ErrorDomain) Enum.valueOf(ErrorDomain.class, str);
    }

    public static ErrorDomain[] values() {
        return (ErrorDomain[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(name());
    }
}
