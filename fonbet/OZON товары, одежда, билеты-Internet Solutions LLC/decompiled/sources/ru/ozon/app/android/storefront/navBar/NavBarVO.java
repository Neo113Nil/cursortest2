package ru.ozon.app.android.storefront.navBar;

import De.C2860c;
import E00.b;
import G.g;
import I0.C3173b;
import Kk.C3532b;
import N3.C3660k;
import Nh.a;
import V.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import spay.sdk.domain.model.FraudMonInfo;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0003'()BO\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\b\u0012\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010Jd\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\b2\b\b\u0002\u0010\u000e\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b\u0007\u0010!R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b%\u0010$R\u001f\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b&\u0010$R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b\u000e\u0010!¨\u0006*"}, d2 = {"Lru/ozon/app/android/storefront/navBar/NavBarVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "LE00/b;", "", "id", "", "isHiding", "", "Lru/ozon/app/android/storefront/navBar/NavBarVO$Action;", "actionPointsLeft", "actionPointsRight", "Lru/ozon/app/android/storefront/navBar/NavBarVO$State;", "states", "isExpanded", "<init>", "(JZLjava/util/List;Ljava/util/List;Ljava/util/List;Z)V", "copy", "(JZLjava/util/List;Ljava/util/List;Ljava/util/List;Z)Lru/ozon/app/android/storefront/navBar/NavBarVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Z", "()Z", "Ljava/util/List;", "getActionPointsLeft", "()Ljava/util/List;", "getActionPointsRight", "getStates", "Action", "State", "ActionType", "nav-bar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NavBarVO implements c, b {
    private final List<Action> actionPointsLeft;
    private final List<Action> actionPointsRight;
    private final long id;
    private final boolean isExpanded;
    private final boolean isHiding;

    @NotNull
    private final List<State> states;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/storefront/navBar/NavBarVO$Action;", "", "", "deeplink", "id", "image", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/storefront/navBar/NavBarVO$ActionType;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/storefront/navBar/NavBarVO$ActionType;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeeplink", "getId", "getImage", "getTitle", "Lru/ozon/app/android/storefront/navBar/NavBarVO$ActionType;", "getType", "()Lru/ozon/app/android/storefront/navBar/NavBarVO$ActionType;", "nav-bar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Action {
        private final String deeplink;

        @NotNull
        private final String id;
        private final String image;
        private final String title;

        @NotNull
        private final ActionType type;

        public Action(String str, @NotNull String id2, String str2, String str3, @NotNull ActionType type) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(type, "type");
            this.deeplink = str;
            this.id = id2;
            this.image = str2;
            this.title = str3;
            this.type = type;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Action)) {
                return false;
            }
            Action action = (Action) other;
            return Intrinsics.d(this.deeplink, action.deeplink) && Intrinsics.d(this.id, action.id) && Intrinsics.d(this.image, action.image) && Intrinsics.d(this.title, action.title) && this.type == action.type;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final String getImage() {
            return this.image;
        }

        @NotNull
        public final ActionType getType() {
            return this.type;
        }

        public int hashCode() {
            String str = this.deeplink;
            int a11 = g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.id);
            String str2 = this.image;
            int hashCode = (a11 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.title;
            return this.type.hashCode() + ((hashCode + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.deeplink;
            String str2 = this.id;
            String str3 = this.image;
            String str4 = this.title;
            ActionType actionType = this.type;
            StringBuilder d11 = C3660k.d("Action(deeplink=", str, ", id=", str2, ", image=");
            a.h(d11, str3, ", title=", str4, ", type=");
            d11.append(actionType);
            d11.append(")");
            return d11.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/navBar/NavBarVO$ActionType;", "", "<init>", "(Ljava/lang/String;I)V", "ACTION", FraudMonInfo.UNKNOWN, "nav-bar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ActionType {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ ActionType[] $VALUES;
        public static final ActionType ACTION = new ActionType("ACTION", 0);
        public static final ActionType UNKNOWN = new ActionType(FraudMonInfo.UNKNOWN, 1);

        private static final /* synthetic */ ActionType[] $values() {
            return new ActionType[]{ACTION, UNKNOWN};
        }

        static {
            ActionType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private ActionType(String str, int i11) {
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/storefront/navBar/NavBarVO$State;", "", "<init>", "()V", "backgroundColor", "", "getBackgroundColor", "()Ljava/lang/String;", "iconColor", "getIconColor", "Default", "Expanded", "Lru/ozon/app/android/storefront/navBar/NavBarVO$State$Default;", "Lru/ozon/app/android/storefront/navBar/NavBarVO$State$Expanded;", "nav-bar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class State {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/storefront/navBar/NavBarVO$State$Default;", "Lru/ozon/app/android/storefront/navBar/NavBarVO$State;", "", "backgroundColor", "iconColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "getIconColor", "nav-bar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Default extends State {
            private final String backgroundColor;
            private final String iconColor;

            public Default(String str, String str2) {
                super(null);
                this.backgroundColor = str;
                this.iconColor = str2;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Default)) {
                    return false;
                }
                Default r52 = (Default) other;
                return Intrinsics.d(this.backgroundColor, r52.backgroundColor) && Intrinsics.d(this.iconColor, r52.iconColor);
            }

            @Override // ru.ozon.app.android.storefront.navBar.NavBarVO.State
            public String getBackgroundColor() {
                return this.backgroundColor;
            }

            @Override // ru.ozon.app.android.storefront.navBar.NavBarVO.State
            public String getIconColor() {
                return this.iconColor;
            }

            public int hashCode() {
                String str = this.backgroundColor;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.iconColor;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return e.a("Default(backgroundColor=", this.backgroundColor, ", iconColor=", this.iconColor, ")");
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/storefront/navBar/NavBarVO$State$Expanded;", "Lru/ozon/app/android/storefront/navBar/NavBarVO$State;", "", "backgroundColor", "iconColor", "scrimColor", "statusBarStyle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "getIconColor", "getScrimColor", "getStatusBarStyle", "nav-bar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Expanded extends State {
            private final String backgroundColor;
            private final String iconColor;
            private final String scrimColor;
            private final String statusBarStyle;

            public Expanded(String str, String str2, String str3, String str4) {
                super(null);
                this.backgroundColor = str;
                this.iconColor = str2;
                this.scrimColor = str3;
                this.statusBarStyle = str4;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Expanded)) {
                    return false;
                }
                Expanded expanded = (Expanded) other;
                return Intrinsics.d(this.backgroundColor, expanded.backgroundColor) && Intrinsics.d(this.iconColor, expanded.iconColor) && Intrinsics.d(this.scrimColor, expanded.scrimColor) && Intrinsics.d(this.statusBarStyle, expanded.statusBarStyle);
            }

            @Override // ru.ozon.app.android.storefront.navBar.NavBarVO.State
            public String getBackgroundColor() {
                return this.backgroundColor;
            }

            @Override // ru.ozon.app.android.storefront.navBar.NavBarVO.State
            public String getIconColor() {
                return this.iconColor;
            }

            public final String getScrimColor() {
                return this.scrimColor;
            }

            public final String getStatusBarStyle() {
                return this.statusBarStyle;
            }

            public int hashCode() {
                String str = this.backgroundColor;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.iconColor;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.scrimColor;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.statusBarStyle;
                return hashCode3 + (str4 != null ? str4.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.backgroundColor;
                String str2 = this.iconColor;
                return C3173b.c(C3660k.d("Expanded(backgroundColor=", str, ", iconColor=", str2, ", scrimColor="), this.scrimColor, ", statusBarStyle=", this.statusBarStyle, ")");
            }
        }

        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract String getBackgroundColor();

        public abstract String getIconColor();

        private State() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NavBarVO(long j11, boolean z11, List<Action> list, List<Action> list2, @NotNull List<? extends State> states, boolean z12) {
        Intrinsics.checkNotNullParameter(states, "states");
        this.id = j11;
        this.isHiding = z11;
        this.actionPointsLeft = list;
        this.actionPointsRight = list2;
        this.states = states;
        this.isExpanded = z12;
    }

    public static /* synthetic */ NavBarVO copy$default(NavBarVO navBarVO, long j11, boolean z11, List list, List list2, List list3, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = navBarVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            z11 = navBarVO.isHiding;
        }
        boolean z13 = z11;
        if ((i11 & 4) != 0) {
            list = navBarVO.actionPointsLeft;
        }
        List list4 = list;
        if ((i11 & 8) != 0) {
            list2 = navBarVO.actionPointsRight;
        }
        List list5 = list2;
        if ((i11 & 16) != 0) {
            list3 = navBarVO.states;
        }
        List list6 = list3;
        if ((i11 & 32) != 0) {
            z12 = navBarVO.isExpanded;
        }
        return navBarVO.copy(j12, z13, list4, list5, list6, z12);
    }

    @NotNull
    public final NavBarVO copy(long id2, boolean isHiding, List<Action> actionPointsLeft, List<Action> actionPointsRight, @NotNull List<? extends State> states, boolean isExpanded) {
        Intrinsics.checkNotNullParameter(states, "states");
        return new NavBarVO(id2, isHiding, actionPointsLeft, actionPointsRight, states, isExpanded);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavBarVO)) {
            return false;
        }
        NavBarVO navBarVO = (NavBarVO) other;
        return this.id == navBarVO.id && this.isHiding == navBarVO.isHiding && Intrinsics.d(this.actionPointsLeft, navBarVO.actionPointsLeft) && Intrinsics.d(this.actionPointsRight, navBarVO.actionPointsRight) && Intrinsics.d(this.states, navBarVO.states) && this.isExpanded == navBarVO.isExpanded;
    }

    public final List<Action> getActionPointsLeft() {
        return this.actionPointsLeft;
    }

    public final List<Action> getActionPointsRight() {
        return this.actionPointsRight;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final List<State> getStates() {
        return this.states;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C3532b.a(Long.hashCode(this.id) * 31, 31, this.isHiding);
        List<Action> list = this.actionPointsLeft;
        int hashCode = (a11 + (list == null ? 0 : list.hashCode())) * 31;
        List<Action> list2 = this.actionPointsRight;
        return Boolean.hashCode(this.isExpanded) + g.b((hashCode + (list2 != null ? list2.hashCode() : 0)) * 31, 31, this.states);
    }

    /* renamed from: isExpanded, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    /* renamed from: isHiding, reason: from getter */
    public final boolean getIsHiding() {
        return this.isHiding;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        boolean z11 = this.isHiding;
        List<Action> list = this.actionPointsLeft;
        List<Action> list2 = this.actionPointsRight;
        List<State> list3 = this.states;
        boolean z12 = this.isExpanded;
        StringBuilder c11 = Bl.b.c(j11, "NavBarVO(id=", ", isHiding=", z11);
        C2860c.g(", actionPointsLeft=", ", actionPointsRight=", c11, list, list2);
        AZ.c.c(c11, ", states=", list3, ", isExpanded=", z12);
        c11.append(")");
        return c11.toString();
    }
}
