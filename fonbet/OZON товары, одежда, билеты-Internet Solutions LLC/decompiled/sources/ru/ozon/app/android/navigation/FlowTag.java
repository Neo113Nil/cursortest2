package ru.ozon.app.android.navigation;

import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qZ.InterfaceC9014f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0087\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006!"}, d2 = {"Lru/ozon/app/android/navigation/FlowTag;", "LqZ/f;", "", "<init>", "(Ljava/lang/String;I)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Companion", "LEGALS", "AUTH", "CHANGE_INFORMATION", "CHECKOUT", "DELETE_ACCOUNT", "FILTER_VALUES", "DELIVERY_REVIEW_OFFER", "TRAVEL_SEARCH_FORM", "TRAVEL_ACCOUNT_BALANCE", "PATH_DYNAMIC_MAP", "SCAN_IT", "START_ONBOARDING", "PUSH_ONBOARDING", "ADDRESS_MAP", "FEEDBACK", "C2C_ORDER", "SELECTION_FORM", "BLOGGER_POST_FORM", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FlowTag implements InterfaceC9014f {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ FlowTag[] $VALUES;

    @NotNull
    private static final InterfaceC9014f ABSENT;

    @NotNull
    public static final Parcelable.Creator<FlowTag> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final FlowTag LEGALS = new FlowTag("LEGALS", 0);
    public static final FlowTag AUTH = new FlowTag("AUTH", 1);
    public static final FlowTag CHANGE_INFORMATION = new FlowTag("CHANGE_INFORMATION", 2);
    public static final FlowTag CHECKOUT = new FlowTag("CHECKOUT", 3);
    public static final FlowTag DELETE_ACCOUNT = new FlowTag("DELETE_ACCOUNT", 4);
    public static final FlowTag FILTER_VALUES = new FlowTag("FILTER_VALUES", 5);
    public static final FlowTag DELIVERY_REVIEW_OFFER = new FlowTag("DELIVERY_REVIEW_OFFER", 6);
    public static final FlowTag TRAVEL_SEARCH_FORM = new FlowTag("TRAVEL_SEARCH_FORM", 7);
    public static final FlowTag TRAVEL_ACCOUNT_BALANCE = new FlowTag("TRAVEL_ACCOUNT_BALANCE", 8);
    public static final FlowTag PATH_DYNAMIC_MAP = new FlowTag("PATH_DYNAMIC_MAP", 9);
    public static final FlowTag SCAN_IT = new FlowTag("SCAN_IT", 10);
    public static final FlowTag START_ONBOARDING = new FlowTag("START_ONBOARDING", 11);
    public static final FlowTag PUSH_ONBOARDING = new FlowTag("PUSH_ONBOARDING", 12);
    public static final FlowTag ADDRESS_MAP = new FlowTag("ADDRESS_MAP", 13);
    public static final FlowTag FEEDBACK = new FlowTag("FEEDBACK", 14);
    public static final FlowTag C2C_ORDER = new FlowTag("C2C_ORDER", 15);
    public static final FlowTag SELECTION_FORM = new FlowTag("SELECTION_FORM", 16);
    public static final FlowTag BLOGGER_POST_FORM = new FlowTag("BLOGGER_POST_FORM", 17);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/navigation/FlowTag$Companion;", "", "<init>", "()V", "LqZ/f;", "ABSENT", "LqZ/f;", "getABSENT", "()LqZ/f;", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InterfaceC9014f getABSENT() {
            return FlowTag.ABSENT;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ FlowTag[] $values() {
        return new FlowTag[]{LEGALS, AUTH, CHANGE_INFORMATION, CHECKOUT, DELETE_ACCOUNT, FILTER_VALUES, DELIVERY_REVIEW_OFFER, TRAVEL_SEARCH_FORM, TRAVEL_ACCOUNT_BALANCE, PATH_DYNAMIC_MAP, SCAN_IT, START_ONBOARDING, PUSH_ONBOARDING, ADDRESS_MAP, FEEDBACK, C2C_ORDER, SELECTION_FORM, BLOGGER_POST_FORM};
    }

    static {
        FlowTag[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
        INSTANCE = new Companion(null);
        CREATOR = new Parcelable.Creator<FlowTag>() { // from class: ru.ozon.app.android.navigation.FlowTag.Creator
            @Override // android.os.Parcelable.Creator
            public final FlowTag createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return FlowTag.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final FlowTag[] newArray(int i11) {
                return new FlowTag[i11];
            }
        };
        InterfaceC9014f.f81797k0.getClass();
        ABSENT = InterfaceC9014f.a.a();
    }

    private FlowTag(String str, int i11) {
    }

    public static FlowTag valueOf(String str) {
        return (FlowTag) Enum.valueOf(FlowTag.class, str);
    }

    public static FlowTag[] values() {
        return (FlowTag[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // qZ.InterfaceC9014f
    public /* bridge */ /* synthetic */ String getName() {
        return name();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
