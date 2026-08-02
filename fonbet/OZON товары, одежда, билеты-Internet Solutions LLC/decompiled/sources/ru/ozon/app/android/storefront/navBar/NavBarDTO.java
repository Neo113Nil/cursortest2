package ru.ozon.app.android.storefront.navBar;

import C.o0;
import Fj.c;
import G.g;
import N3.C3660k;
import Nh.a;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB1\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\rJ>\u0010\u0012\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0006\u0010\r¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/storefront/navBar/NavBarDTO;", "", "actionPointsLeft", "", "Lru/ozon/app/android/storefront/navBar/NavBarDTO$Action;", "actionPointsRight", "isHiding", "", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;)V", "getActionPointsLeft", "()Ljava/util/List;", "getActionPointsRight", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;)Lru/ozon/app/android/storefront/navBar/NavBarDTO;", "equals", "other", "hashCode", "", "toString", "", "Companion", "Action", "nav-bar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NavBarDTO {

    @NotNull
    public static final String NESTED_PLACEHOLDER_CENTER = "default";

    @NotNull
    public static final String NESTED_PLACEHOLDER_EXPANDED = "expanded";

    @NotNull
    public static final String NESTED_PLACEHOLDER_LEFT = "left";

    @NotNull
    public static final String NESTED_PLACEHOLDER_RIGHT = "right";
    private final List<Action> actionPointsLeft;
    private final List<Action> actionPointsRight;
    private final Boolean isHiding;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/storefront/navBar/NavBarDTO$Action;", "", "type", "", "id", "deeplink", "image", SelectionItemFormDTO.TITLE_FIELD_NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getId", "getDeeplink", "getImage", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "nav-bar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Action {
        private final String deeplink;

        @NotNull
        private final String id;

        @NotNull
        private final String image;
        private final String title;

        @NotNull
        private final String type;

        public Action(@NotNull String type, @NotNull String id2, String str, @NotNull String image, String str2) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(image, "image");
            this.type = type;
            this.id = id2;
            this.deeplink = str;
            this.image = image;
            this.title = str2;
        }

        public static /* synthetic */ Action copy$default(Action action, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = action.type;
            }
            if ((i11 & 2) != 0) {
                str2 = action.id;
            }
            if ((i11 & 4) != 0) {
                str3 = action.deeplink;
            }
            if ((i11 & 8) != 0) {
                str4 = action.image;
            }
            if ((i11 & 16) != 0) {
                str5 = action.title;
            }
            String str6 = str5;
            String str7 = str3;
            return action.copy(str, str2, str7, str4, str6);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final Action copy(@NotNull String type, @NotNull String id2, String deeplink, @NotNull String image, String title) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(image, "image");
            return new Action(type, id2, deeplink, image, title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Action)) {
                return false;
            }
            Action action = (Action) other;
            return Intrinsics.d(this.type, action.type) && Intrinsics.d(this.id, action.id) && Intrinsics.d(this.deeplink, action.deeplink) && Intrinsics.d(this.image, action.image) && Intrinsics.d(this.title, action.title);
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int a11 = g.a(this.type.hashCode() * 31, 31, this.id);
            String str = this.deeplink;
            int a12 = g.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.image);
            String str2 = this.title;
            return a12 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.type;
            String str2 = this.id;
            String str3 = this.deeplink;
            String str4 = this.image;
            String str5 = this.title;
            StringBuilder d11 = C3660k.d("Action(type=", str, ", id=", str2, ", deeplink=");
            a.h(d11, str3, ", image=", str4, ", title=");
            return o0.c(d11, str5, ")");
        }
    }

    public NavBarDTO(List<Action> list, List<Action> list2, Boolean bool) {
        this.actionPointsLeft = list;
        this.actionPointsRight = list2;
        this.isHiding = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NavBarDTO copy$default(NavBarDTO navBarDTO, List list, List list2, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = navBarDTO.actionPointsLeft;
        }
        if ((i11 & 2) != 0) {
            list2 = navBarDTO.actionPointsRight;
        }
        if ((i11 & 4) != 0) {
            bool = navBarDTO.isHiding;
        }
        return navBarDTO.copy(list, list2, bool);
    }

    public final List<Action> component1() {
        return this.actionPointsLeft;
    }

    public final List<Action> component2() {
        return this.actionPointsRight;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getIsHiding() {
        return this.isHiding;
    }

    @NotNull
    public final NavBarDTO copy(List<Action> actionPointsLeft, List<Action> actionPointsRight, Boolean isHiding) {
        return new NavBarDTO(actionPointsLeft, actionPointsRight, isHiding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavBarDTO)) {
            return false;
        }
        NavBarDTO navBarDTO = (NavBarDTO) other;
        return Intrinsics.d(this.actionPointsLeft, navBarDTO.actionPointsLeft) && Intrinsics.d(this.actionPointsRight, navBarDTO.actionPointsRight) && Intrinsics.d(this.isHiding, navBarDTO.isHiding);
    }

    public final List<Action> getActionPointsLeft() {
        return this.actionPointsLeft;
    }

    public final List<Action> getActionPointsRight() {
        return this.actionPointsRight;
    }

    public int hashCode() {
        List<Action> list = this.actionPointsLeft;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<Action> list2 = this.actionPointsRight;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.isHiding;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isHiding() {
        return this.isHiding;
    }

    @NotNull
    public String toString() {
        List<Action> list = this.actionPointsLeft;
        List<Action> list2 = this.actionPointsRight;
        return D3.g.d(c.d("NavBarDTO(actionPointsLeft=", list, ", actionPointsRight=", ", isHiding=", list2), this.isHiding, ")");
    }
}
