package ru.ozon.app.android.atoms.data.notification;

import B0.C2454a;
import Bk.C2638a;
import C.J;
import D40.c;
import De.C2859b;
import G.g;
import N3.C3660k;
import Nh.a;
import Sc.InterfaceC3999a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.R;
import ru.ozon.app.android.atoms.data.AtomActionDTO;
import ru.ozon.app.android.atoms.data.AtomDTO;
import ru.ozon.app.android.atoms.data.AtomType;
import ru.ozon.app.android.atoms.data.DsAtomsType;
import ru.ozon.app.android.atoms.data.TestInfo;
import ru.ozon.app.android.atoms.data.button.ButtonV3Atom;
import ru.ozon.app.android.atoms.data.timer.TimerAtom;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@InterfaceC3999a
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0003789B\u0085\u0001\b\u0004\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b0\u0010\u001fR(\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u00101\u001a\u0004\b2\u00103R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u00104\u001a\u0004\b5\u00106\u0082\u0001\u0002:;¨\u0006<"}, d2 = {"Lru/ozon/app/android/atoms/data/notification/NotificationAtom;", "Lru/ozon/app/android/atoms/data/AtomDTO;", "", "", "seconds", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/app/android/atoms/data/notification/NotificationAtom$Position;", "position", "Lru/ozon/app/android/atoms/data/button/ButtonV3Atom$SmallButton;", "button", "", "showDisclosure", "Lru/ozon/app/android/atoms/data/AtomActionDTO;", "action", "Lru/ozon/app/android/atoms/data/AtomType;", "type", "context", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/app/android/atoms/data/TestInfo;", "testInfo", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/notification/NotificationAtom$Position;Lru/ozon/app/android/atoms/data/button/ButtonV3Atom$SmallButton;Ljava/lang/Boolean;Lru/ozon/app/android/atoms/data/AtomActionDTO;Lru/ozon/app/android/atoms/data/AtomType;Ljava/lang/String;Ljava/util/Map;Lru/ozon/app/android/atoms/data/TestInfo;)V", "Ljava/lang/Integer;", "getSeconds", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "Lru/ozon/app/android/atoms/data/notification/NotificationAtom$Position;", "getPosition", "()Lru/ozon/app/android/atoms/data/notification/NotificationAtom$Position;", "Lru/ozon/app/android/atoms/data/button/ButtonV3Atom$SmallButton;", "getButton", "()Lru/ozon/app/android/atoms/data/button/ButtonV3Atom$SmallButton;", "Ljava/lang/Boolean;", "getShowDisclosure", "()Ljava/lang/Boolean;", "Lru/ozon/app/android/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/app/android/atoms/data/AtomActionDTO;", "Lru/ozon/app/android/atoms/data/AtomType;", "getType", "()Lru/ozon/app/android/atoms/data/AtomType;", "getContext", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Lru/ozon/app/android/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/app/android/atoms/data/TestInfo;", "Notification", "NotificationWithIcon", "Position", "Lru/ozon/app/android/atoms/data/notification/NotificationAtom$Notification;", "Lru/ozon/app/android/atoms/data/notification/NotificationAtom$NotificationWithIcon;", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class NotificationAtom extends AtomDTO implements Parcelable {
    public static final int $stable = 8;
    private final AtomActionDTO action;
    private final ButtonV3Atom.SmallButton button;
    private final String context;
    private final Position position;
    private final Integer seconds;
    private final Boolean showDisclosure;
    private final String subtitle;
    private final TestInfo testInfo;

    @NotNull
    private final String title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final AtomType type;

    @InterfaceC3999a
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010/\u001a\u00020\u0005H\u0016J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001cJ\t\u00102\u001a\u00020\u0007HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010&J\u000b\u00107\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u009c\u0001\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0002\u0010<J\u0006\u0010=\u001a\u00020\u0005J\u0013\u0010>\u001a\u00020\u000e2\b\u0010?\u001a\u0004\u0018\u00010@HÖ\u0003J\t\u0010A\u001a\u00020\u0005HÖ\u0001J\t\u0010B\u001a\u00020\u0007HÖ\u0001J\u0016\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u0006H"}, d2 = {"Lru/ozon/app/android/atoms/data/notification/NotificationAtom$Notification;", "Lru/ozon/app/android/atoms/data/notification/NotificationAtom;", DynamicElementDTO.TIMER, "Lru/ozon/app/android/atoms/data/timer/TimerAtom;", "seconds", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "position", "Lru/ozon/app/android/atoms/data/notification/NotificationAtom$Position;", "button", "Lru/ozon/app/android/atoms/data/button/ButtonV3Atom$SmallButton;", "showDisclosure", "", "action", "Lru/ozon/app/android/atoms/data/AtomActionDTO;", "context", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/app/android/atoms/data/TestInfo;", "<init>", "(Lru/ozon/app/android/atoms/data/timer/TimerAtom;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/notification/NotificationAtom$Position;Lru/ozon/app/android/atoms/data/button/ButtonV3Atom$SmallButton;Ljava/lang/Boolean;Lru/ozon/app/android/atoms/data/AtomActionDTO;Ljava/lang/String;Ljava/util/Map;Lru/ozon/app/android/atoms/data/TestInfo;)V", "getTimer", "()Lru/ozon/app/android/atoms/data/timer/TimerAtom;", "getSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getPosition", "()Lru/ozon/app/android/atoms/data/notification/NotificationAtom$Position;", "getButton", "()Lru/ozon/app/android/atoms/data/button/ButtonV3Atom$SmallButton;", "getShowDisclosure", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAction", "()Lru/ozon/app/android/atoms/data/AtomActionDTO;", "getContext", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/app/android/atoms/data/TestInfo;", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Lru/ozon/app/android/atoms/data/timer/TimerAtom;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/notification/NotificationAtom$Position;Lru/ozon/app/android/atoms/data/button/ButtonV3Atom$SmallButton;Ljava/lang/Boolean;Lru/ozon/app/android/atoms/data/AtomActionDTO;Ljava/lang/String;Ljava/util/Map;Lru/ozon/app/android/atoms/data/TestInfo;)Lru/ozon/app/android/atoms/data/notification/NotificationAtom$Notification;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Notification extends NotificationAtom {
        public static final int $stable = 8;

        @NotNull
        public static final Parcelable.Creator<Notification> CREATOR = new Creator();
        private final AtomActionDTO action;
        private final ButtonV3Atom.SmallButton button;
        private final String context;
        private final Position position;
        private final Integer seconds;
        private final Boolean showDisclosure;
        private final String subtitle;
        private final TestInfo testInfo;
        private final TimerAtom timer;

        @NotNull
        private final String title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Notification> {
            @Override // android.os.Parcelable.Creator
            public final Notification createFromParcel(Parcel parcel) {
                Boolean valueOf;
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                TimerAtom createFromParcel = parcel.readInt() == 0 ? null : TimerAtom.CREATOR.createFromParcel(parcel);
                Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Position valueOf3 = parcel.readInt() == 0 ? null : Position.valueOf(parcel.readString());
                ButtonV3Atom.SmallButton createFromParcel2 = parcel.readInt() == 0 ? null : ButtonV3Atom.SmallButton.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                AtomActionDTO createFromParcel3 = parcel.readInt() == 0 ? null : AtomActionDTO.CREATOR.createFromParcel(parcel);
                String readString3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = C2859b.a(Notification.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new Notification(createFromParcel, valueOf2, readString, readString2, valueOf3, createFromParcel2, valueOf, createFromParcel3, readString3, linkedHashMap, parcel.readInt() != 0 ? TestInfo.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Notification[] newArray(int i11) {
                return new Notification[i11];
            }
        }

        public /* synthetic */ Notification(TimerAtom timerAtom, Integer num, String str, String str2, Position position, ButtonV3Atom.SmallButton smallButton, Boolean bool, AtomActionDTO atomActionDTO, String str3, Map map, TestInfo testInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(timerAtom, num, str, str2, position, smallButton, bool, atomActionDTO, (i11 & 256) != 0 ? null : str3, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : map, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : testInfo);
        }

        public static /* synthetic */ Notification copy$default(Notification notification, TimerAtom timerAtom, Integer num, String str, String str2, Position position, ButtonV3Atom.SmallButton smallButton, Boolean bool, AtomActionDTO atomActionDTO, String str3, Map map, TestInfo testInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                timerAtom = notification.timer;
            }
            if ((i11 & 2) != 0) {
                num = notification.seconds;
            }
            if ((i11 & 4) != 0) {
                str = notification.title;
            }
            if ((i11 & 8) != 0) {
                str2 = notification.subtitle;
            }
            if ((i11 & 16) != 0) {
                position = notification.position;
            }
            if ((i11 & 32) != 0) {
                smallButton = notification.button;
            }
            if ((i11 & 64) != 0) {
                bool = notification.showDisclosure;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                atomActionDTO = notification.action;
            }
            if ((i11 & 256) != 0) {
                str3 = notification.context;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                map = notification.trackingInfo;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                testInfo = notification.testInfo;
            }
            Map map2 = map;
            TestInfo testInfo2 = testInfo;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            String str4 = str3;
            ButtonV3Atom.SmallButton smallButton2 = smallButton;
            Boolean bool2 = bool;
            Position position2 = position;
            String str5 = str;
            return notification.copy(timerAtom, num, str5, str2, position2, smallButton2, bool2, atomActionDTO2, str4, map2, testInfo2);
        }

        /* renamed from: component1, reason: from getter */
        public final TimerAtom getTimer() {
            return this.timer;
        }

        public final Map<String, TokenizedTrackingInfo> component10() {
            return this.trackingInfo;
        }

        /* renamed from: component11, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getSeconds() {
            return this.seconds;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component5, reason: from getter */
        public final Position getPosition() {
            return this.position;
        }

        /* renamed from: component6, reason: from getter */
        public final ButtonV3Atom.SmallButton getButton() {
            return this.button;
        }

        /* renamed from: component7, reason: from getter */
        public final Boolean getShowDisclosure() {
            return this.showDisclosure;
        }

        /* renamed from: component8, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component9, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        @NotNull
        public final Notification copy(TimerAtom timer, Integer seconds, @NotNull String title, String subtitle, Position position, ButtonV3Atom.SmallButton button, Boolean showDisclosure, AtomActionDTO action, String context, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new Notification(timer, seconds, title, subtitle, position, button, showDisclosure, action, context, trackingInfo, testInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Notification)) {
                return false;
            }
            Notification notification = (Notification) other;
            return Intrinsics.d(this.timer, notification.timer) && Intrinsics.d(this.seconds, notification.seconds) && Intrinsics.d(this.title, notification.title) && Intrinsics.d(this.subtitle, notification.subtitle) && this.position == notification.position && Intrinsics.d(this.button, notification.button) && Intrinsics.d(this.showDisclosure, notification.showDisclosure) && Intrinsics.d(this.action, notification.action) && Intrinsics.d(this.context, notification.context) && Intrinsics.d(this.trackingInfo, notification.trackingInfo) && Intrinsics.d(this.testInfo, notification.testInfo);
        }

        @Override // ru.ozon.app.android.atoms.data.notification.NotificationAtom
        public AtomActionDTO getAction() {
            return this.action;
        }

        @Override // ru.ozon.app.android.atoms.data.notification.NotificationAtom
        public ButtonV3Atom.SmallButton getButton() {
            return this.button;
        }

        @Override // ru.ozon.app.android.atoms.data.notification.NotificationAtom, ru.ozon.app.android.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R.id.atom_type_notification;
        }

        @Override // ru.ozon.app.android.atoms.data.notification.NotificationAtom
        public Position getPosition() {
            return this.position;
        }

        @Override // ru.ozon.app.android.atoms.data.notification.NotificationAtom
        public Integer getSeconds() {
            return this.seconds;
        }

        @Override // ru.ozon.app.android.atoms.data.notification.NotificationAtom
        public Boolean getShowDisclosure() {
            return this.showDisclosure;
        }

        @Override // ru.ozon.app.android.atoms.data.notification.NotificationAtom
        public String getSubtitle() {
            return this.subtitle;
        }

        @Override // ru.ozon.app.android.atoms.data.notification.NotificationAtom, ru.ozon.app.android.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final TimerAtom getTimer() {
            return this.timer;
        }

        @Override // ru.ozon.app.android.atoms.data.notification.NotificationAtom
        @NotNull
        public String getTitle() {
            return this.title;
        }

        @Override // ru.ozon.app.android.atoms.data.notification.NotificationAtom, ru.ozon.app.android.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            TimerAtom timerAtom = this.timer;
            int hashCode = (timerAtom == null ? 0 : timerAtom.hashCode()) * 31;
            Integer num = this.seconds;
            int a11 = g.a((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.title);
            String str = this.subtitle;
            int hashCode2 = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            Position position = this.position;
            int hashCode3 = (hashCode2 + (position == null ? 0 : position.hashCode())) * 31;
            ButtonV3Atom.SmallButton smallButton = this.button;
            int hashCode4 = (hashCode3 + (smallButton == null ? 0 : smallButton.hashCode())) * 31;
            Boolean bool = this.showDisclosure;
            int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode6 = (hashCode5 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            String str2 = this.context;
            int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode8 = (hashCode7 + (map == null ? 0 : map.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            return hashCode8 + (testInfo != null ? testInfo.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TimerAtom timerAtom = this.timer;
            Integer num = this.seconds;
            String str = this.title;
            String str2 = this.subtitle;
            Position position = this.position;
            ButtonV3Atom.SmallButton smallButton = this.button;
            Boolean bool = this.showDisclosure;
            AtomActionDTO atomActionDTO = this.action;
            String str3 = this.context;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            TestInfo testInfo = this.testInfo;
            StringBuilder sb2 = new StringBuilder("Notification(timer=");
            sb2.append(timerAtom);
            sb2.append(", seconds=");
            sb2.append(num);
            sb2.append(", title=");
            a.h(sb2, str, ", subtitle=", str2, ", position=");
            sb2.append(position);
            sb2.append(", button=");
            sb2.append(smallButton);
            sb2.append(", showDisclosure=");
            sb2.append(bool);
            sb2.append(", action=");
            sb2.append(atomActionDTO);
            sb2.append(", context=");
            C2638a.e(sb2, str3, ", trackingInfo=", map, ", testInfo=");
            sb2.append(testInfo);
            sb2.append(")");
            return sb2.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            TimerAtom timerAtom = this.timer;
            if (timerAtom == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                timerAtom.writeToParcel(dest, flags);
            }
            Integer num = this.seconds;
            if (num == null) {
                dest.writeInt(0);
            } else {
                a.f(dest, 1, num);
            }
            dest.writeString(this.title);
            dest.writeString(this.subtitle);
            Position position = this.position;
            if (position == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(position.name());
            }
            ButtonV3Atom.SmallButton smallButton = this.button;
            if (smallButton == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                smallButton.writeToParcel(dest, flags);
            }
            Boolean bool = this.showDisclosure;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                c.c(dest, 1, bool);
            }
            AtomActionDTO atomActionDTO = this.action;
            if (atomActionDTO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                atomActionDTO.writeToParcel(dest, flags);
            }
            dest.writeString(this.context);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            if (map == null) {
                dest.writeInt(0);
            } else {
                Iterator e11 = J.e(map, dest, 1);
                while (e11.hasNext()) {
                    Map.Entry entry = (Map.Entry) e11.next();
                    dest.writeString((String) entry.getKey());
                    dest.writeParcelable((Parcelable) entry.getValue(), flags);
                }
            }
            TestInfo testInfo = this.testInfo;
            if (testInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                testInfo.writeToParcel(dest, flags);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Notification(TimerAtom timerAtom, Integer num, @NotNull String title, String str, Position position, ButtonV3Atom.SmallButton smallButton, Boolean bool, AtomActionDTO atomActionDTO, String str2, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
            super(num, title, str, position, smallButton, bool, atomActionDTO, DsAtomsType.NOTIFICATION_WITHOUT_ICON, str2, map, testInfo, null);
            Intrinsics.checkNotNullParameter(title, "title");
            this.timer = timerAtom;
            this.seconds = num;
            this.title = title;
            this.subtitle = str;
            this.position = position;
            this.button = smallButton;
            this.showDisclosure = bool;
            this.action = atomActionDTO;
            this.context = str2;
            this.trackingInfo = map;
            this.testInfo = testInfo;
        }
    }

    @InterfaceC3999a
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\b\u00101\u001a\u00020\u0007H\u0016J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001fJ\t\u00106\u001a\u00020\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010(J\u000b\u0010;\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0017HÆ\u0003J²\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0002\u0010@J\u0006\u0010A\u001a\u00020\u0007J\u0013\u0010B\u001a\u00020\u000f2\b\u0010C\u001a\u0004\u0018\u00010DHÖ\u0003J\t\u0010E\u001a\u00020\u0007HÖ\u0001J\t\u0010F\u001a\u00020\u0003HÖ\u0001J\u0016\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100¨\u0006L"}, d2 = {"Lru/ozon/app/android/atoms/data/notification/NotificationAtom$NotificationWithIcon;", "Lru/ozon/app/android/atoms/data/notification/NotificationAtom;", "icon", "", "iconTintColor", "iconBackgroundColor", "seconds", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "position", "Lru/ozon/app/android/atoms/data/notification/NotificationAtom$Position;", "button", "Lru/ozon/app/android/atoms/data/button/ButtonV3Atom$SmallButton;", "showDisclosure", "", "action", "Lru/ozon/app/android/atoms/data/AtomActionDTO;", "context", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/app/android/atoms/data/TestInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/notification/NotificationAtom$Position;Lru/ozon/app/android/atoms/data/button/ButtonV3Atom$SmallButton;Ljava/lang/Boolean;Lru/ozon/app/android/atoms/data/AtomActionDTO;Ljava/lang/String;Ljava/util/Map;Lru/ozon/app/android/atoms/data/TestInfo;)V", "getIcon", "()Ljava/lang/String;", "getIconTintColor", "getIconBackgroundColor", "getSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTitle", "getSubtitle", "getPosition", "()Lru/ozon/app/android/atoms/data/notification/NotificationAtom$Position;", "getButton", "()Lru/ozon/app/android/atoms/data/button/ButtonV3Atom$SmallButton;", "getShowDisclosure", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAction", "()Lru/ozon/app/android/atoms/data/AtomActionDTO;", "getContext", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/app/android/atoms/data/TestInfo;", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/notification/NotificationAtom$Position;Lru/ozon/app/android/atoms/data/button/ButtonV3Atom$SmallButton;Ljava/lang/Boolean;Lru/ozon/app/android/atoms/data/AtomActionDTO;Ljava/lang/String;Ljava/util/Map;Lru/ozon/app/android/atoms/data/TestInfo;)Lru/ozon/app/android/atoms/data/notification/NotificationAtom$NotificationWithIcon;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class NotificationWithIcon extends NotificationAtom {
        public static final int $stable = 8;

        @NotNull
        public static final Parcelable.Creator<NotificationWithIcon> CREATOR = new Creator();
        private final AtomActionDTO action;
        private final ButtonV3Atom.SmallButton button;
        private final String context;

        @NotNull
        private final String icon;
        private final String iconBackgroundColor;
        private final String iconTintColor;
        private final Position position;
        private final Integer seconds;
        private final Boolean showDisclosure;
        private final String subtitle;
        private final TestInfo testInfo;

        @NotNull
        private final String title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NotificationWithIcon> {
            @Override // android.os.Parcelable.Creator
            public final NotificationWithIcon createFromParcel(Parcel parcel) {
                Boolean valueOf;
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                Position valueOf3 = parcel.readInt() == 0 ? null : Position.valueOf(parcel.readString());
                ButtonV3Atom.SmallButton createFromParcel = parcel.readInt() == 0 ? null : ButtonV3Atom.SmallButton.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                AtomActionDTO createFromParcel2 = parcel.readInt() == 0 ? null : AtomActionDTO.CREATOR.createFromParcel(parcel);
                String readString6 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = C2859b.a(NotificationWithIcon.class, parcel, linkedHashMap, parcel.readString(), i11, 1);
                        readInt = readInt;
                    }
                }
                return new NotificationWithIcon(readString, readString2, readString3, valueOf2, readString4, readString5, valueOf3, createFromParcel, valueOf, createFromParcel2, readString6, linkedHashMap, parcel.readInt() != 0 ? TestInfo.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationWithIcon[] newArray(int i11) {
                return new NotificationWithIcon[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotificationWithIcon(@NotNull String icon, String str, String str2, Integer num, @NotNull String title, String str3, Position position, ButtonV3Atom.SmallButton smallButton, Boolean bool, AtomActionDTO atomActionDTO, String str4, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
            super(num, title, str3, position, smallButton, bool, atomActionDTO, DsAtomsType.NOTIFICATION_WITH_ICON, str4, map, testInfo, null);
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            this.icon = icon;
            this.iconTintColor = str;
            this.iconBackgroundColor = str2;
            this.seconds = num;
            this.title = title;
            this.subtitle = str3;
            this.position = position;
            this.button = smallButton;
            this.showDisclosure = bool;
            this.action = atomActionDTO;
            this.context = str4;
            this.trackingInfo = map;
            this.testInfo = testInfo;
        }

        public static /* synthetic */ NotificationWithIcon copy$default(NotificationWithIcon notificationWithIcon, String str, String str2, String str3, Integer num, String str4, String str5, Position position, ButtonV3Atom.SmallButton smallButton, Boolean bool, AtomActionDTO atomActionDTO, String str6, Map map, TestInfo testInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = notificationWithIcon.icon;
            }
            return notificationWithIcon.copy(str, (i11 & 2) != 0 ? notificationWithIcon.iconTintColor : str2, (i11 & 4) != 0 ? notificationWithIcon.iconBackgroundColor : str3, (i11 & 8) != 0 ? notificationWithIcon.seconds : num, (i11 & 16) != 0 ? notificationWithIcon.title : str4, (i11 & 32) != 0 ? notificationWithIcon.subtitle : str5, (i11 & 64) != 0 ? notificationWithIcon.position : position, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? notificationWithIcon.button : smallButton, (i11 & 256) != 0 ? notificationWithIcon.showDisclosure : bool, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? notificationWithIcon.action : atomActionDTO, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? notificationWithIcon.context : str6, (i11 & 2048) != 0 ? notificationWithIcon.trackingInfo : map, (i11 & 4096) != 0 ? notificationWithIcon.testInfo : testInfo);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* renamed from: component10, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component11, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        public final Map<String, TokenizedTrackingInfo> component12() {
            return this.trackingInfo;
        }

        /* renamed from: component13, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        /* renamed from: component2, reason: from getter */
        public final String getIconTintColor() {
            return this.iconTintColor;
        }

        /* renamed from: component3, reason: from getter */
        public final String getIconBackgroundColor() {
            return this.iconBackgroundColor;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getSeconds() {
            return this.seconds;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component6, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component7, reason: from getter */
        public final Position getPosition() {
            return this.position;
        }

        /* renamed from: component8, reason: from getter */
        public final ButtonV3Atom.SmallButton getButton() {
            return this.button;
        }

        /* renamed from: component9, reason: from getter */
        public final Boolean getShowDisclosure() {
            return this.showDisclosure;
        }

        @NotNull
        public final NotificationWithIcon copy(@NotNull String icon, String iconTintColor, String iconBackgroundColor, Integer seconds, @NotNull String title, String subtitle, Position position, ButtonV3Atom.SmallButton button, Boolean showDisclosure, AtomActionDTO action, String context, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            return new NotificationWithIcon(icon, iconTintColor, iconBackgroundColor, seconds, title, subtitle, position, button, showDisclosure, action, context, trackingInfo, testInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NotificationWithIcon)) {
                return false;
            }
            NotificationWithIcon notificationWithIcon = (NotificationWithIcon) other;
            return Intrinsics.d(this.icon, notificationWithIcon.icon) && Intrinsics.d(this.iconTintColor, notificationWithIcon.iconTintColor) && Intrinsics.d(this.iconBackgroundColor, notificationWithIcon.iconBackgroundColor) && Intrinsics.d(this.seconds, notificationWithIcon.seconds) && Intrinsics.d(this.title, notificationWithIcon.title) && Intrinsics.d(this.subtitle, notificationWithIcon.subtitle) && this.position == notificationWithIcon.position && Intrinsics.d(this.button, notificationWithIcon.button) && Intrinsics.d(this.showDisclosure, notificationWithIcon.showDisclosure) && Intrinsics.d(this.action, notificationWithIcon.action) && Intrinsics.d(this.context, notificationWithIcon.context) && Intrinsics.d(this.trackingInfo, notificationWithIcon.trackingInfo) && Intrinsics.d(this.testInfo, notificationWithIcon.testInfo);
        }

        @Override // ru.ozon.app.android.atoms.data.notification.NotificationAtom
        public AtomActionDTO getAction() {
            return this.action;
        }

        @Override // ru.ozon.app.android.atoms.data.notification.NotificationAtom
        public ButtonV3Atom.SmallButton getButton() {
            return this.button;
        }

        @Override // ru.ozon.app.android.atoms.data.notification.NotificationAtom, ru.ozon.app.android.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        public final String getIconBackgroundColor() {
            return this.iconBackgroundColor;
        }

        public final String getIconTintColor() {
            return this.iconTintColor;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R.id.atom_type_notification_with_icon;
        }

        @Override // ru.ozon.app.android.atoms.data.notification.NotificationAtom
        public Position getPosition() {
            return this.position;
        }

        @Override // ru.ozon.app.android.atoms.data.notification.NotificationAtom
        public Integer getSeconds() {
            return this.seconds;
        }

        @Override // ru.ozon.app.android.atoms.data.notification.NotificationAtom
        public Boolean getShowDisclosure() {
            return this.showDisclosure;
        }

        @Override // ru.ozon.app.android.atoms.data.notification.NotificationAtom
        public String getSubtitle() {
            return this.subtitle;
        }

        @Override // ru.ozon.app.android.atoms.data.notification.NotificationAtom, ru.ozon.app.android.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        @Override // ru.ozon.app.android.atoms.data.notification.NotificationAtom
        @NotNull
        public String getTitle() {
            return this.title;
        }

        @Override // ru.ozon.app.android.atoms.data.notification.NotificationAtom, ru.ozon.app.android.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.icon.hashCode() * 31;
            String str = this.iconTintColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.iconBackgroundColor;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.seconds;
            int a11 = g.a((hashCode3 + (num == null ? 0 : num.hashCode())) * 31, 31, this.title);
            String str3 = this.subtitle;
            int hashCode4 = (a11 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Position position = this.position;
            int hashCode5 = (hashCode4 + (position == null ? 0 : position.hashCode())) * 31;
            ButtonV3Atom.SmallButton smallButton = this.button;
            int hashCode6 = (hashCode5 + (smallButton == null ? 0 : smallButton.hashCode())) * 31;
            Boolean bool = this.showDisclosure;
            int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode8 = (hashCode7 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            String str4 = this.context;
            int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode10 = (hashCode9 + (map == null ? 0 : map.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            return hashCode10 + (testInfo != null ? testInfo.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.icon;
            String str2 = this.iconTintColor;
            String str3 = this.iconBackgroundColor;
            Integer num = this.seconds;
            String str4 = this.title;
            String str5 = this.subtitle;
            Position position = this.position;
            ButtonV3Atom.SmallButton smallButton = this.button;
            Boolean bool = this.showDisclosure;
            AtomActionDTO atomActionDTO = this.action;
            String str6 = this.context;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            TestInfo testInfo = this.testInfo;
            StringBuilder d11 = C3660k.d("NotificationWithIcon(icon=", str, ", iconTintColor=", str2, ", iconBackgroundColor=");
            C2454a.f(num, str3, ", seconds=", ", title=", d11);
            a.h(d11, str4, ", subtitle=", str5, ", position=");
            d11.append(position);
            d11.append(", button=");
            d11.append(smallButton);
            d11.append(", showDisclosure=");
            d11.append(bool);
            d11.append(", action=");
            d11.append(atomActionDTO);
            d11.append(", context=");
            C2638a.e(d11, str6, ", trackingInfo=", map, ", testInfo=");
            d11.append(testInfo);
            d11.append(")");
            return d11.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.icon);
            dest.writeString(this.iconTintColor);
            dest.writeString(this.iconBackgroundColor);
            Integer num = this.seconds;
            if (num == null) {
                dest.writeInt(0);
            } else {
                a.f(dest, 1, num);
            }
            dest.writeString(this.title);
            dest.writeString(this.subtitle);
            Position position = this.position;
            if (position == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(position.name());
            }
            ButtonV3Atom.SmallButton smallButton = this.button;
            if (smallButton == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                smallButton.writeToParcel(dest, flags);
            }
            Boolean bool = this.showDisclosure;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                c.c(dest, 1, bool);
            }
            AtomActionDTO atomActionDTO = this.action;
            if (atomActionDTO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                atomActionDTO.writeToParcel(dest, flags);
            }
            dest.writeString(this.context);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            if (map == null) {
                dest.writeInt(0);
            } else {
                Iterator e11 = J.e(map, dest, 1);
                while (e11.hasNext()) {
                    Map.Entry entry = (Map.Entry) e11.next();
                    dest.writeString((String) entry.getKey());
                    dest.writeParcelable((Parcelable) entry.getValue(), flags);
                }
            }
            TestInfo testInfo = this.testInfo;
            if (testInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                testInfo.writeToParcel(dest, flags);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/atoms/data/notification/NotificationAtom$Position;", "", "<init>", "(Ljava/lang/String;I)V", "POSITION_ABOVE_BOTTOM_WIDGETS", "POSITION_ABOVE_TABBAR", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Position {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ Position[] $VALUES;

        @i(name = "POSITION_ABOVE_BOTTOM_WIDGETS")
        public static final Position POSITION_ABOVE_BOTTOM_WIDGETS = new Position("POSITION_ABOVE_BOTTOM_WIDGETS", 0);

        @i(name = "POSITION_ABOVE_TABBAR")
        public static final Position POSITION_ABOVE_TABBAR = new Position("POSITION_ABOVE_TABBAR", 1);

        private static final /* synthetic */ Position[] $values() {
            return new Position[]{POSITION_ABOVE_BOTTOM_WIDGETS, POSITION_ABOVE_TABBAR};
        }

        static {
            Position[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Position(String str, int i11) {
        }

        @NotNull
        public static Xc.a<Position> getEntries() {
            return $ENTRIES;
        }

        public static Position valueOf(String str) {
            return (Position) Enum.valueOf(Position.class, str);
        }

        public static Position[] values() {
            return (Position[]) $VALUES.clone();
        }
    }

    public /* synthetic */ NotificationAtom(Integer num, String str, String str2, Position position, ButtonV3Atom.SmallButton smallButton, Boolean bool, AtomActionDTO atomActionDTO, AtomType atomType, String str3, Map map, TestInfo testInfo, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str, str2, position, smallButton, bool, atomActionDTO, atomType, str3, map, testInfo);
    }

    public AtomActionDTO getAction() {
        return this.action;
    }

    public ButtonV3Atom.SmallButton getButton() {
        return this.button;
    }

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    public Position getPosition() {
        return this.position;
    }

    public Integer getSeconds() {
        return this.seconds;
    }

    public Boolean getShowDisclosure() {
        return this.showDisclosure;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public String getTitle() {
        return this.title;
    }

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
    @NotNull
    public AtomType getType() {
        return this.type;
    }

    public /* synthetic */ NotificationAtom(Integer num, String str, String str2, Position position, ButtonV3Atom.SmallButton smallButton, Boolean bool, AtomActionDTO atomActionDTO, AtomType atomType, String str3, Map map, TestInfo testInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str, str2, position, smallButton, bool, atomActionDTO, atomType, (i11 & 256) != 0 ? null : str3, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : map, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : testInfo, null);
    }

    private NotificationAtom(Integer num, String str, String str2, Position position, ButtonV3Atom.SmallButton smallButton, Boolean bool, AtomActionDTO atomActionDTO, AtomType atomType, String str3, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
        super(atomType, str3, map, testInfo);
        this.seconds = num;
        this.title = str;
        this.subtitle = str2;
        this.position = position;
        this.button = smallButton;
        this.showDisclosure = bool;
        this.action = atomActionDTO;
        this.type = atomType;
        this.context = str3;
        this.trackingInfo = map;
        this.testInfo = testInfo;
    }
}
