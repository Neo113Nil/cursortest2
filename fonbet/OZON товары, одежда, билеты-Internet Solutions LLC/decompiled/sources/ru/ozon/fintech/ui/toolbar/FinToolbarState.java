package ru.ozon.fintech.ui.toolbar;

import B4.V;
import K00.b;
import N3.C3660k;
import Nh.a;
import android.view.MenuItem;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 L2\u00020\u0001:\u0001LBõ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u00107\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u00109\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010<\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010?\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010)J\u0017\u0010C\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t\u0018\u00010\u0017HÆ\u0003J\t\u0010D\u001a\u00020\u0010HÆ\u0003Jü\u0001\u0010E\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u0010HÆ\u0001¢\u0006\u0002\u0010FJ\u0013\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010J\u001a\u00020\u0010HÖ\u0001J\t\u0010K\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\"R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\"R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010*\u001a\u0004\b-\u0010)R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010*\u001a\u0004\b/\u0010)R\u001f\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0019\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b2\u00103¨\u0006M"}, d2 = {"Lru/ozon/fintech/ui/toolbar/FinToolbarState;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subTitle", "rightAtomText", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "rightAtomClicked", "Lkotlin/Function0;", "", "leftAtomText", "leftAtomClicked", "avatarColor", "avatarSrc", "avatarClicked", "navigationIcon", "", "navigationIconColor", "navigationClicked", "menuResId", "menuResColor", "externalMenuIconId", "menuItemClicked", "Lkotlin/Function1;", "Landroid/view/MenuItem;", "titleGravity", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lkotlin/jvm/functions/Function0;Lru/ozon/uni/atoms/data/texts/TextAtom;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;I)V", "getTitle", "()Ljava/lang/String;", "getSubTitle", "getRightAtomText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getRightAtomClicked", "()Lkotlin/jvm/functions/Function0;", "getLeftAtomText", "getLeftAtomClicked", "getAvatarColor", "getAvatarSrc", "getAvatarClicked", "getNavigationIcon", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNavigationIconColor", "getNavigationClicked", "getMenuResId", "getMenuResColor", "getExternalMenuIconId", "getMenuItemClicked", "()Lkotlin/jvm/functions/Function1;", "getTitleGravity", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lkotlin/jvm/functions/Function0;Lru/ozon/uni/atoms/data/texts/TextAtom;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;I)Lru/ozon/fintech/ui/toolbar/FinToolbarState;", "equals", "", "other", "hashCode", "toString", "Companion", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FinToolbarState {
    private final Function0<Unit> avatarClicked;
    private final String avatarColor;
    private final String avatarSrc;
    private final Integer externalMenuIconId;
    private final Function0<Unit> leftAtomClicked;
    private final TextAtom leftAtomText;
    private final Function1<MenuItem, Unit> menuItemClicked;
    private final String menuResColor;
    private final Integer menuResId;
    private final Function0<Unit> navigationClicked;
    private final Integer navigationIcon;
    private final String navigationIconColor;
    private final Function0<Unit> rightAtomClicked;
    private final TextAtom rightAtomText;
    private final String subTitle;
    private final String title;
    private final int titleGravity;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final FinToolbarState EMPTY = new FinToolbarState(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 131071, null);
    private static final int CLOSE_MENU_RES = R.menu.fintolbar_close_menu;
    private static final int CLOSE_WITH_CIRCLE_BACKGROUND_MENU_RES = R.menu.fintolbar_close_with_circle_background_menu;
    private static final int THREE_DOTS_MENU_RES = R.menu.fintolbar_three_dots_menu;
    private static final int CLOSE_MENU_ITEM = R.id.fintech_menu_close;
    private static final int THREE_DOTS_MENU_ITEM = R.id.fintech_menu_three_dots;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0016\u0010\u0012\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, d2 = {"Lru/ozon/fintech/ui/toolbar/FinToolbarState$Companion;", "", "<init>", "()V", "EMPTY", "Lru/ozon/fintech/ui/toolbar/FinToolbarState;", "getEMPTY", "()Lru/ozon/fintech/ui/toolbar/FinToolbarState;", "CLOSE_MENU_RES", "", "getCLOSE_MENU_RES", "()I", "CLOSE_WITH_CIRCLE_BACKGROUND_MENU_RES", "getCLOSE_WITH_CIRCLE_BACKGROUND_MENU_RES", "THREE_DOTS_MENU_RES", "getTHREE_DOTS_MENU_RES", "CLOSE_MENU_ITEM", "getCLOSE_MENU_ITEM", "THREE_DOTS_MENU_ITEM", "getTHREE_DOTS_MENU_ITEM", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getCLOSE_MENU_ITEM() {
            return FinToolbarState.CLOSE_MENU_ITEM;
        }

        public final int getCLOSE_MENU_RES() {
            return FinToolbarState.CLOSE_MENU_RES;
        }

        public final int getCLOSE_WITH_CIRCLE_BACKGROUND_MENU_RES() {
            return FinToolbarState.CLOSE_WITH_CIRCLE_BACKGROUND_MENU_RES;
        }

        @NotNull
        public final FinToolbarState getEMPTY() {
            return FinToolbarState.EMPTY;
        }

        public final int getTHREE_DOTS_MENU_ITEM() {
            return FinToolbarState.THREE_DOTS_MENU_ITEM;
        }

        public final int getTHREE_DOTS_MENU_RES() {
            return FinToolbarState.THREE_DOTS_MENU_RES;
        }

        private Companion() {
        }
    }

    public FinToolbarState() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 131071, null);
    }

    public static /* synthetic */ FinToolbarState copy$default(FinToolbarState finToolbarState, String str, String str2, TextAtom textAtom, Function0 function0, TextAtom textAtom2, Function0 function02, String str3, String str4, Function0 function03, Integer num, String str5, Function0 function04, Integer num2, String str6, Integer num3, Function1 function1, int i11, int i12, Object obj) {
        int i13;
        Function1 function12;
        String str7;
        FinToolbarState finToolbarState2;
        Integer num4;
        String str8;
        TextAtom textAtom3;
        Function0 function05;
        TextAtom textAtom4;
        Function0 function06;
        String str9;
        String str10;
        Function0 function07;
        Integer num5;
        String str11;
        Function0 function08;
        Integer num6;
        String str12;
        String str13 = (i12 & 1) != 0 ? finToolbarState.title : str;
        String str14 = (i12 & 2) != 0 ? finToolbarState.subTitle : str2;
        TextAtom textAtom5 = (i12 & 4) != 0 ? finToolbarState.rightAtomText : textAtom;
        Function0 function09 = (i12 & 8) != 0 ? finToolbarState.rightAtomClicked : function0;
        TextAtom textAtom6 = (i12 & 16) != 0 ? finToolbarState.leftAtomText : textAtom2;
        Function0 function010 = (i12 & 32) != 0 ? finToolbarState.leftAtomClicked : function02;
        String str15 = (i12 & 64) != 0 ? finToolbarState.avatarColor : str3;
        String str16 = (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? finToolbarState.avatarSrc : str4;
        Function0 function011 = (i12 & 256) != 0 ? finToolbarState.avatarClicked : function03;
        Integer num7 = (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? finToolbarState.navigationIcon : num;
        String str17 = (i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? finToolbarState.navigationIconColor : str5;
        Function0 function012 = (i12 & 2048) != 0 ? finToolbarState.navigationClicked : function04;
        Integer num8 = (i12 & 4096) != 0 ? finToolbarState.menuResId : num2;
        String str18 = (i12 & 8192) != 0 ? finToolbarState.menuResColor : str6;
        String str19 = str13;
        Integer num9 = (i12 & 16384) != 0 ? finToolbarState.externalMenuIconId : num3;
        Function1 function13 = (i12 & 32768) != 0 ? finToolbarState.menuItemClicked : function1;
        if ((i12 & 65536) != 0) {
            function12 = function13;
            i13 = finToolbarState.titleGravity;
            num4 = num9;
            str8 = str14;
            textAtom3 = textAtom5;
            function05 = function09;
            textAtom4 = textAtom6;
            function06 = function010;
            str9 = str15;
            str10 = str16;
            function07 = function011;
            num5 = num7;
            str11 = str17;
            function08 = function012;
            num6 = num8;
            str12 = str18;
            str7 = str19;
            finToolbarState2 = finToolbarState;
        } else {
            i13 = i11;
            function12 = function13;
            str7 = str19;
            finToolbarState2 = finToolbarState;
            num4 = num9;
            str8 = str14;
            textAtom3 = textAtom5;
            function05 = function09;
            textAtom4 = textAtom6;
            function06 = function010;
            str9 = str15;
            str10 = str16;
            function07 = function011;
            num5 = num7;
            str11 = str17;
            function08 = function012;
            num6 = num8;
            str12 = str18;
        }
        return finToolbarState2.copy(str7, str8, textAtom3, function05, textAtom4, function06, str9, str10, function07, num5, str11, function08, num6, str12, num4, function12, i13);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final Integer getNavigationIcon() {
        return this.navigationIcon;
    }

    /* renamed from: component11, reason: from getter */
    public final String getNavigationIconColor() {
        return this.navigationIconColor;
    }

    public final Function0<Unit> component12() {
        return this.navigationClicked;
    }

    /* renamed from: component13, reason: from getter */
    public final Integer getMenuResId() {
        return this.menuResId;
    }

    /* renamed from: component14, reason: from getter */
    public final String getMenuResColor() {
        return this.menuResColor;
    }

    /* renamed from: component15, reason: from getter */
    public final Integer getExternalMenuIconId() {
        return this.externalMenuIconId;
    }

    public final Function1<MenuItem, Unit> component16() {
        return this.menuItemClicked;
    }

    /* renamed from: component17, reason: from getter */
    public final int getTitleGravity() {
        return this.titleGravity;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final TextAtom getRightAtomText() {
        return this.rightAtomText;
    }

    public final Function0<Unit> component4() {
        return this.rightAtomClicked;
    }

    /* renamed from: component5, reason: from getter */
    public final TextAtom getLeftAtomText() {
        return this.leftAtomText;
    }

    public final Function0<Unit> component6() {
        return this.leftAtomClicked;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAvatarColor() {
        return this.avatarColor;
    }

    /* renamed from: component8, reason: from getter */
    public final String getAvatarSrc() {
        return this.avatarSrc;
    }

    public final Function0<Unit> component9() {
        return this.avatarClicked;
    }

    @NotNull
    public final FinToolbarState copy(String title, String subTitle, TextAtom rightAtomText, Function0<Unit> rightAtomClicked, TextAtom leftAtomText, Function0<Unit> leftAtomClicked, String avatarColor, String avatarSrc, Function0<Unit> avatarClicked, Integer navigationIcon, String navigationIconColor, Function0<Unit> navigationClicked, Integer menuResId, String menuResColor, Integer externalMenuIconId, Function1<? super MenuItem, Unit> menuItemClicked, int titleGravity) {
        return new FinToolbarState(title, subTitle, rightAtomText, rightAtomClicked, leftAtomText, leftAtomClicked, avatarColor, avatarSrc, avatarClicked, navigationIcon, navigationIconColor, navigationClicked, menuResId, menuResColor, externalMenuIconId, menuItemClicked, titleGravity);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinToolbarState)) {
            return false;
        }
        FinToolbarState finToolbarState = (FinToolbarState) other;
        return Intrinsics.d(this.title, finToolbarState.title) && Intrinsics.d(this.subTitle, finToolbarState.subTitle) && Intrinsics.d(this.rightAtomText, finToolbarState.rightAtomText) && Intrinsics.d(this.rightAtomClicked, finToolbarState.rightAtomClicked) && Intrinsics.d(this.leftAtomText, finToolbarState.leftAtomText) && Intrinsics.d(this.leftAtomClicked, finToolbarState.leftAtomClicked) && Intrinsics.d(this.avatarColor, finToolbarState.avatarColor) && Intrinsics.d(this.avatarSrc, finToolbarState.avatarSrc) && Intrinsics.d(this.avatarClicked, finToolbarState.avatarClicked) && Intrinsics.d(this.navigationIcon, finToolbarState.navigationIcon) && Intrinsics.d(this.navigationIconColor, finToolbarState.navigationIconColor) && Intrinsics.d(this.navigationClicked, finToolbarState.navigationClicked) && Intrinsics.d(this.menuResId, finToolbarState.menuResId) && Intrinsics.d(this.menuResColor, finToolbarState.menuResColor) && Intrinsics.d(this.externalMenuIconId, finToolbarState.externalMenuIconId) && Intrinsics.d(this.menuItemClicked, finToolbarState.menuItemClicked) && this.titleGravity == finToolbarState.titleGravity;
    }

    public final Function0<Unit> getAvatarClicked() {
        return this.avatarClicked;
    }

    public final String getAvatarColor() {
        return this.avatarColor;
    }

    public final String getAvatarSrc() {
        return this.avatarSrc;
    }

    public final Integer getExternalMenuIconId() {
        return this.externalMenuIconId;
    }

    public final Function0<Unit> getLeftAtomClicked() {
        return this.leftAtomClicked;
    }

    public final TextAtom getLeftAtomText() {
        return this.leftAtomText;
    }

    public final Function1<MenuItem, Unit> getMenuItemClicked() {
        return this.menuItemClicked;
    }

    public final String getMenuResColor() {
        return this.menuResColor;
    }

    public final Integer getMenuResId() {
        return this.menuResId;
    }

    public final Function0<Unit> getNavigationClicked() {
        return this.navigationClicked;
    }

    public final Integer getNavigationIcon() {
        return this.navigationIcon;
    }

    public final String getNavigationIconColor() {
        return this.navigationIconColor;
    }

    public final Function0<Unit> getRightAtomClicked() {
        return this.rightAtomClicked;
    }

    public final TextAtom getRightAtomText() {
        return this.rightAtomText;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getTitleGravity() {
        return this.titleGravity;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subTitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        TextAtom textAtom = this.rightAtomText;
        int hashCode3 = (hashCode2 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        Function0<Unit> function0 = this.rightAtomClicked;
        int hashCode4 = (hashCode3 + (function0 == null ? 0 : function0.hashCode())) * 31;
        TextAtom textAtom2 = this.leftAtomText;
        int hashCode5 = (hashCode4 + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
        Function0<Unit> function02 = this.leftAtomClicked;
        int hashCode6 = (hashCode5 + (function02 == null ? 0 : function02.hashCode())) * 31;
        String str3 = this.avatarColor;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.avatarSrc;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Function0<Unit> function03 = this.avatarClicked;
        int hashCode9 = (hashCode8 + (function03 == null ? 0 : function03.hashCode())) * 31;
        Integer num = this.navigationIcon;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.navigationIconColor;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Function0<Unit> function04 = this.navigationClicked;
        int hashCode12 = (hashCode11 + (function04 == null ? 0 : function04.hashCode())) * 31;
        Integer num2 = this.menuResId;
        int hashCode13 = (hashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str6 = this.menuResColor;
        int hashCode14 = (hashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num3 = this.externalMenuIconId;
        int hashCode15 = (hashCode14 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Function1<MenuItem, Unit> function1 = this.menuItemClicked;
        return Integer.hashCode(this.titleGravity) + ((hashCode15 + (function1 != null ? function1.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.subTitle;
        TextAtom textAtom = this.rightAtomText;
        Function0<Unit> function0 = this.rightAtomClicked;
        TextAtom textAtom2 = this.leftAtomText;
        Function0<Unit> function02 = this.leftAtomClicked;
        String str3 = this.avatarColor;
        String str4 = this.avatarSrc;
        Function0<Unit> function03 = this.avatarClicked;
        Integer num = this.navigationIcon;
        String str5 = this.navigationIconColor;
        Function0<Unit> function04 = this.navigationClicked;
        Integer num2 = this.menuResId;
        String str6 = this.menuResColor;
        Integer num3 = this.externalMenuIconId;
        Function1<MenuItem, Unit> function1 = this.menuItemClicked;
        int i11 = this.titleGravity;
        StringBuilder d11 = C3660k.d("FinToolbarState(title=", str, ", subTitle=", str2, ", rightAtomText=");
        d11.append(textAtom);
        d11.append(", rightAtomClicked=");
        d11.append(function0);
        d11.append(", leftAtomText=");
        d11.append(textAtom2);
        d11.append(", leftAtomClicked=");
        d11.append(function02);
        d11.append(", avatarColor=");
        a.h(d11, str3, ", avatarSrc=", str4, ", avatarClicked=");
        d11.append(function03);
        d11.append(", navigationIcon=");
        d11.append(num);
        d11.append(", navigationIconColor=");
        d11.append(str5);
        d11.append(", navigationClicked=");
        d11.append(function04);
        d11.append(", menuResId=");
        V.f(num2, ", menuResColor=", str6, ", externalMenuIconId=", d11);
        d11.append(num3);
        d11.append(", menuItemClicked=");
        d11.append(function1);
        d11.append(", titleGravity=");
        return b.e(i11, ")", d11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FinToolbarState(String str, String str2, TextAtom textAtom, Function0<Unit> function0, TextAtom textAtom2, Function0<Unit> function02, String str3, String str4, Function0<Unit> function03, Integer num, String str5, Function0<Unit> function04, Integer num2, String str6, Integer num3, Function1<? super MenuItem, Unit> function1, int i11) {
        this.title = str;
        this.subTitle = str2;
        this.rightAtomText = textAtom;
        this.rightAtomClicked = function0;
        this.leftAtomText = textAtom2;
        this.leftAtomClicked = function02;
        this.avatarColor = str3;
        this.avatarSrc = str4;
        this.avatarClicked = function03;
        this.navigationIcon = num;
        this.navigationIconColor = str5;
        this.navigationClicked = function04;
        this.menuResId = num2;
        this.menuResColor = str6;
        this.externalMenuIconId = num3;
        this.menuItemClicked = function1;
        this.titleGravity = i11;
    }

    public /* synthetic */ FinToolbarState(String str, String str2, TextAtom textAtom, Function0 function0, TextAtom textAtom2, Function0 function02, String str3, String str4, Function0 function03, Integer num, String str5, Function0 function04, Integer num2, String str6, Integer num3, Function1 function1, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : textAtom, (i12 & 8) != 0 ? null : function0, (i12 & 16) != 0 ? null : textAtom2, (i12 & 32) != 0 ? null : function02, (i12 & 64) != 0 ? null : str3, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str4, (i12 & 256) != 0 ? null : function03, (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : num, (i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : str5, (i12 & 2048) != 0 ? null : function04, (i12 & 4096) != 0 ? null : num2, (i12 & 8192) != 0 ? null : str6, (i12 & 16384) != 0 ? null : num3, (i12 & 32768) != 0 ? null : function1, (i12 & 65536) != 0 ? 8388611 : i11);
    }
}
