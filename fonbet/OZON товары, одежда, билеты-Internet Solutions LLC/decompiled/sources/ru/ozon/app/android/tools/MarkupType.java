package ru.ozon.app.android.tools;

import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.data.SelectionItemDescriptionDTO;
import spay.sdk.domain.model.FraudMonInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00142\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0014B\u0015\b\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/tools/MarkupType;", "Landroid/os/Parcelable;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "MARKDOWN", "HTML", SelectionItemDescriptionDTO.PLAIN_TEXT, FraudMonInfo.UNKNOWN, "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MarkupType implements Parcelable {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MarkupType[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<MarkupType> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private final String type;
    public static final MarkupType MARKDOWN = new MarkupType("MARKDOWN", 0, "markdown");
    public static final MarkupType HTML = new MarkupType("HTML", 1, "html");
    public static final MarkupType PLAIN_TEXT = new MarkupType(SelectionItemDescriptionDTO.PLAIN_TEXT, 2, "plain");
    public static final MarkupType UNKNOWN = new MarkupType(FraudMonInfo.UNKNOWN, 3, null, 1, null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/tools/MarkupType$Companion;", "", "<init>", "()V", "getByType", "Lru/ozon/app/android/tools/MarkupType;", "s", "", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MarkupType getByType(@NotNull String s11) {
            Intrinsics.checkNotNullParameter(s11, "s");
            for (MarkupType markupType : MarkupType.values()) {
                if (Intrinsics.d(markupType.getType(), s11)) {
                    return markupType;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ MarkupType[] $values() {
        return new MarkupType[]{MARKDOWN, HTML, PLAIN_TEXT, UNKNOWN};
    }

    static {
        MarkupType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
        INSTANCE = new Companion(null);
        CREATOR = new Parcelable.Creator<MarkupType>() { // from class: ru.ozon.app.android.tools.MarkupType.Creator
            @Override // android.os.Parcelable.Creator
            public final MarkupType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return MarkupType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final MarkupType[] newArray(int i11) {
                return new MarkupType[i11];
            }
        };
    }

    private MarkupType(String str, int i11, String str2) {
        this.type = str2;
    }

    public static MarkupType valueOf(String str) {
        return (MarkupType) Enum.valueOf(MarkupType.class, str);
    }

    public static MarkupType[] values() {
        return (MarkupType[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }

    /* synthetic */ MarkupType(String str, int i11, String str2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, (i12 & 1) != 0 ? null : str2);
    }
}
