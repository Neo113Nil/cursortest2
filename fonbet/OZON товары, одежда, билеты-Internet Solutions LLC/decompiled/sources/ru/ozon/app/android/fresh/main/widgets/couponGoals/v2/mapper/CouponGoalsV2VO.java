package ru.ozon.app.android.fresh.main.widgets.couponGoals.v2.mapper;

import G.g;
import Gl.C3124a;
import Kk.C3532b;
import Lh.a;
import Ns.b;
import Ve.C4598rp;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001!B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/mapper/CouponGoalsV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/mapper/CouponGoalsV2VO$CouponGoalItemVO;", "items", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLjava/util/List;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "CouponGoalItemVO", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CouponGoalsV2VO implements c {
    private final long id;

    @NotNull
    private final List<CouponGoalItemVO> items;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002Ba\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u000e\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b\u0006\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0019R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b*\u0010)R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b.\u0010)R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b3\u00104R\u001f\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u00105\u001a\u0004\b6\u00107¨\u00068"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/mapper/CouponGoalsV2VO$CouponGoalItemVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "isCompleted", "", "image", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "description", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "actionText", "", "progress", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JZLjava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Integer;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Z", "()Z", "Ljava/lang/String;", "getImage", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDescription", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getActionText", "Ljava/lang/Integer;", "getProgress", "()Ljava/lang/Integer;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CouponGoalItemVO implements c {

        @NotNull
        private final AtomAction action;

        @NotNull
        private final TextDTO actionText;

        @NotNull
        private final BadgeDTO badge;

        @NotNull
        private final TextDTO description;
        private final long id;

        @NotNull
        private final String image;
        private final boolean isCompleted;
        private final Integer progress;

        @NotNull
        private final TextDTO title;
        private final t tokenizedEvent;

        public CouponGoalItemVO(long j11, boolean z11, @NotNull String image, @NotNull TextDTO title, @NotNull TextDTO description, @NotNull BadgeDTO badge, @NotNull TextDTO actionText, Integer num, @NotNull AtomAction action, t tVar) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(badge, "badge");
            Intrinsics.checkNotNullParameter(actionText, "actionText");
            Intrinsics.checkNotNullParameter(action, "action");
            this.id = j11;
            this.isCompleted = z11;
            this.image = image;
            this.title = title;
            this.description = description;
            this.badge = badge;
            this.actionText = actionText;
            this.progress = num;
            this.action = action;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CouponGoalItemVO)) {
                return false;
            }
            CouponGoalItemVO couponGoalItemVO = (CouponGoalItemVO) other;
            return this.id == couponGoalItemVO.id && this.isCompleted == couponGoalItemVO.isCompleted && Intrinsics.d(this.image, couponGoalItemVO.image) && Intrinsics.d(this.title, couponGoalItemVO.title) && Intrinsics.d(this.description, couponGoalItemVO.description) && Intrinsics.d(this.badge, couponGoalItemVO.badge) && Intrinsics.d(this.actionText, couponGoalItemVO.actionText) && Intrinsics.d(this.progress, couponGoalItemVO.progress) && Intrinsics.d(this.action, couponGoalItemVO.action) && Intrinsics.d(this.tokenizedEvent, couponGoalItemVO.tokenizedEvent);
        }

        @NotNull
        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final TextDTO getActionText() {
            return this.actionText;
        }

        @NotNull
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @NotNull
        public final TextDTO getDescription() {
            return this.description;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final Integer getProgress() {
            return this.progress;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return null;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        @Override // l20.c
        public int getViewItemKey() {
            return hashCode();
        }

        public int hashCode() {
            int a11 = b.a(this.actionText, C3124a.c(this.badge, b.a(this.description, b.a(this.title, g.a(C3532b.a(Long.hashCode(this.id) * 31, 31, this.isCompleted), 31, this.image), 31), 31), 31), 31);
            Integer num = this.progress;
            int a12 = C4598rp.a(this.action, (a11 + (num == null ? 0 : num.hashCode())) * 31, 31);
            t tVar = this.tokenizedEvent;
            return a12 + (tVar != null ? tVar.hashCode() : 0);
        }

        /* renamed from: isCompleted, reason: from getter */
        public final boolean getIsCompleted() {
            return this.isCompleted;
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            boolean z11 = this.isCompleted;
            String str = this.image;
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.description;
            BadgeDTO badgeDTO = this.badge;
            TextDTO textDTO3 = this.actionText;
            Integer num = this.progress;
            AtomAction atomAction = this.action;
            t tVar = this.tokenizedEvent;
            StringBuilder c11 = Bl.b.c(j11, "CouponGoalItemVO(id=", ", isCompleted=", z11);
            c11.append(", image=");
            c11.append(str);
            c11.append(", title=");
            c11.append(textDTO);
            c11.append(", description=");
            c11.append(textDTO2);
            c11.append(", badge=");
            c11.append(badgeDTO);
            c11.append(", actionText=");
            c11.append(textDTO3);
            c11.append(", progress=");
            c11.append(num);
            Fj.c.e(tVar, ", action=", ", tokenizedEvent=", c11, atomAction);
            c11.append(")");
            return c11.toString();
        }
    }

    public CouponGoalsV2VO(long j11, @NotNull List<CouponGoalItemVO> items, t tVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.id = j11;
        this.items = items;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CouponGoalsV2VO)) {
            return false;
        }
        CouponGoalsV2VO couponGoalsV2VO = (CouponGoalsV2VO) other;
        return this.id == couponGoalsV2VO.id && Intrinsics.d(this.items, couponGoalsV2VO.items) && Intrinsics.d(this.tokenizedEvent, couponGoalsV2VO.tokenizedEvent);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<CouponGoalItemVO> getItems() {
        return this.items;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.items);
        t tVar = this.tokenizedEvent;
        return b11 + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<CouponGoalItemVO> list = this.items;
        return a.b(Lh.b.b(j11, "CouponGoalsV2VO(id=", ", items=", list), ", tokenizedEvent=", this.tokenizedEvent, ")");
    }
}
