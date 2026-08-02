package ru.ozon.app.android.commonwidgets.widgets.restrictions.presentation;

import G.g;
import N3.C3660k;
import WZ.t;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.flashbar.model.Restriction;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\"#B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ6\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/restrictions/presentation/RestrictionsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/commonwidgets/widgets/restrictions/presentation/RestrictionsVO$RestrictionVO;", "restrictions", "Lru/ozon/app/android/commonwidgets/widgets/restrictions/presentation/RestrictionsVO$ShowOnceStrategy;", "strategy", "<init>", "(JLjava/util/List;Lru/ozon/app/android/commonwidgets/widgets/restrictions/presentation/RestrictionsVO$ShowOnceStrategy;)V", "copy", "(JLjava/util/List;Lru/ozon/app/android/commonwidgets/widgets/restrictions/presentation/RestrictionsVO$ShowOnceStrategy;)Lru/ozon/app/android/commonwidgets/widgets/restrictions/presentation/RestrictionsVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getRestrictions", "()Ljava/util/List;", "Lru/ozon/app/android/commonwidgets/widgets/restrictions/presentation/RestrictionsVO$ShowOnceStrategy;", "getStrategy", "()Lru/ozon/app/android/commonwidgets/widgets/restrictions/presentation/RestrictionsVO$ShowOnceStrategy;", "RestrictionVO", "ShowOnceStrategy", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RestrictionsVO implements c {
    private final long id;

    @NotNull
    private final List<RestrictionVO> restrictions;
    private final ShowOnceStrategy strategy;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/restrictions/presentation/RestrictionsVO$ShowOnceStrategy;", "", "", "token", "Lru/ozon/app/android/commonwidgets/widgets/restrictions/presentation/RestrictionsVO$ShowOnceStrategy$Lifetime;", "lifetime", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/commonwidgets/widgets/restrictions/presentation/RestrictionsVO$ShowOnceStrategy$Lifetime;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getToken", "Lru/ozon/app/android/commonwidgets/widgets/restrictions/presentation/RestrictionsVO$ShowOnceStrategy$Lifetime;", "getLifetime", "()Lru/ozon/app/android/commonwidgets/widgets/restrictions/presentation/RestrictionsVO$ShowOnceStrategy$Lifetime;", "Lifetime", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShowOnceStrategy {

        @NotNull
        private final Lifetime lifetime;

        @NotNull
        private final String token;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/restrictions/presentation/RestrictionsVO$ShowOnceStrategy$Lifetime;", "", "<init>", "(Ljava/lang/String;I)V", "PER_APP", "PER_SCREEN", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Lifetime {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ Lifetime[] $VALUES;
            public static final Lifetime PER_APP = new Lifetime("PER_APP", 0);
            public static final Lifetime PER_SCREEN = new Lifetime("PER_SCREEN", 1);

            private static final /* synthetic */ Lifetime[] $values() {
                return new Lifetime[]{PER_APP, PER_SCREEN};
            }

            static {
                Lifetime[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private Lifetime(String str, int i11) {
            }

            public static Lifetime valueOf(String str) {
                return (Lifetime) Enum.valueOf(Lifetime.class, str);
            }

            public static Lifetime[] values() {
                return (Lifetime[]) $VALUES.clone();
            }
        }

        public ShowOnceStrategy(@NotNull String token, @NotNull Lifetime lifetime) {
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(lifetime, "lifetime");
            this.token = token;
            this.lifetime = lifetime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowOnceStrategy)) {
                return false;
            }
            ShowOnceStrategy showOnceStrategy = (ShowOnceStrategy) other;
            return Intrinsics.d(this.token, showOnceStrategy.token) && this.lifetime == showOnceStrategy.lifetime;
        }

        @NotNull
        public final Lifetime getLifetime() {
            return this.lifetime;
        }

        @NotNull
        public final String getToken() {
            return this.token;
        }

        public int hashCode() {
            return this.lifetime.hashCode() + (this.token.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "ShowOnceStrategy(token=" + this.token + ", lifetime=" + this.lifetime + ")";
        }
    }

    public RestrictionsVO(long j11, @NotNull List<RestrictionVO> restrictions, ShowOnceStrategy showOnceStrategy) {
        Intrinsics.checkNotNullParameter(restrictions, "restrictions");
        this.id = j11;
        this.restrictions = restrictions;
        this.strategy = showOnceStrategy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RestrictionsVO copy$default(RestrictionsVO restrictionsVO, long j11, List list, ShowOnceStrategy showOnceStrategy, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = restrictionsVO.id;
        }
        if ((i11 & 2) != 0) {
            list = restrictionsVO.restrictions;
        }
        if ((i11 & 4) != 0) {
            showOnceStrategy = restrictionsVO.strategy;
        }
        return restrictionsVO.copy(j11, list, showOnceStrategy);
    }

    @NotNull
    public final RestrictionsVO copy(long id2, @NotNull List<RestrictionVO> restrictions, ShowOnceStrategy strategy) {
        Intrinsics.checkNotNullParameter(restrictions, "restrictions");
        return new RestrictionsVO(id2, restrictions, strategy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RestrictionsVO)) {
            return false;
        }
        RestrictionsVO restrictionsVO = (RestrictionsVO) other;
        return this.id == restrictionsVO.id && Intrinsics.d(this.restrictions, restrictionsVO.restrictions) && Intrinsics.d(this.strategy, restrictionsVO.strategy);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<RestrictionVO> getRestrictions() {
        return this.restrictions;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final ShowOnceStrategy getStrategy() {
        return this.strategy;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.restrictions);
        ShowOnceStrategy showOnceStrategy = this.strategy;
        return b11 + (showOnceStrategy == null ? 0 : showOnceStrategy.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<RestrictionVO> list = this.restrictions;
        ShowOnceStrategy showOnceStrategy = this.strategy;
        StringBuilder b11 = Lh.b.b(j11, "RestrictionsVO(id=", ", restrictions=", list);
        b11.append(", strategy=");
        b11.append(showOnceStrategy);
        b11.append(")");
        return b11.toString();
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b#\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b$\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b+\u0010\u0016R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.R\u001f\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/restrictions/presentation/RestrictionsVO$RestrictionVO;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "message", "image", "imageTintColor", "type", "lifetime", "Lru/ozon/uni/android/flashbar/model/Restriction$ActionButton;", "actionButton", "Lru/ozon/uni/android/flashbar/model/Restriction$Action;", "action", "context", "Lru/ozon/uni/android/flashbar/model/Restriction$Progress;", "progress", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "event", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/android/flashbar/model/Restriction$ActionButton;Lru/ozon/uni/android/flashbar/model/Restriction$Action;Ljava/lang/String;Lru/ozon/uni/android/flashbar/model/Restriction$Progress;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getMessage", "getImage", "getImageTintColor", "getType", "getLifetime", "Lru/ozon/uni/android/flashbar/model/Restriction$ActionButton;", "getActionButton", "()Lru/ozon/uni/android/flashbar/model/Restriction$ActionButton;", "Lru/ozon/uni/android/flashbar/model/Restriction$Action;", "getAction", "()Lru/ozon/uni/android/flashbar/model/Restriction$Action;", "getContext", "Lru/ozon/uni/android/flashbar/model/Restriction$Progress;", "getProgress", "()Lru/ozon/uni/android/flashbar/model/Restriction$Progress;", "LWZ/t;", "getEvent", "()LWZ/t;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RestrictionVO {
        private final Restriction.Action action;
        private final Restriction.ActionButton actionButton;
        private final String context;
        private final t event;
        private final String image;
        private final String imageTintColor;
        private final String lifetime;

        @NotNull
        private final String message;
        private final Restriction.Progress progress;
        private final String title;

        @NotNull
        private final String type;

        public RestrictionVO(String str, @NotNull String message, String str2, String str3, @NotNull String type, String str4, Restriction.ActionButton actionButton, Restriction.Action action, String str5, Restriction.Progress progress, t tVar) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(type, "type");
            this.title = str;
            this.message = message;
            this.image = str2;
            this.imageTintColor = str3;
            this.type = type;
            this.lifetime = str4;
            this.actionButton = actionButton;
            this.action = action;
            this.context = str5;
            this.progress = progress;
            this.event = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RestrictionVO)) {
                return false;
            }
            RestrictionVO restrictionVO = (RestrictionVO) other;
            return Intrinsics.d(this.title, restrictionVO.title) && Intrinsics.d(this.message, restrictionVO.message) && Intrinsics.d(this.image, restrictionVO.image) && Intrinsics.d(this.imageTintColor, restrictionVO.imageTintColor) && Intrinsics.d(this.type, restrictionVO.type) && Intrinsics.d(this.lifetime, restrictionVO.lifetime) && Intrinsics.d(this.actionButton, restrictionVO.actionButton) && Intrinsics.d(this.action, restrictionVO.action) && Intrinsics.d(this.context, restrictionVO.context) && Intrinsics.d(this.progress, restrictionVO.progress) && Intrinsics.d(this.event, restrictionVO.event);
        }

        public final Restriction.Action getAction() {
            return this.action;
        }

        public final Restriction.ActionButton getActionButton() {
            return this.actionButton;
        }

        public final String getContext() {
            return this.context;
        }

        public final t getEvent() {
            return this.event;
        }

        public final String getImage() {
            return this.image;
        }

        public final String getImageTintColor() {
            return this.imageTintColor;
        }

        public final String getLifetime() {
            return this.lifetime;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public final Restriction.Progress getProgress() {
            return this.progress;
        }

        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            String str = this.title;
            int a11 = g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.message);
            String str2 = this.image;
            int hashCode = (a11 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.imageTintColor;
            int a12 = g.a((hashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.type);
            String str4 = this.lifetime;
            int hashCode2 = (a12 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Restriction.ActionButton actionButton = this.actionButton;
            int hashCode3 = (hashCode2 + (actionButton == null ? 0 : actionButton.hashCode())) * 31;
            Restriction.Action action = this.action;
            int hashCode4 = (hashCode3 + (action == null ? 0 : action.hashCode())) * 31;
            String str5 = this.context;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Restriction.Progress progress = this.progress;
            int hashCode6 = (hashCode5 + (progress == null ? 0 : progress.hashCode())) * 31;
            t tVar = this.event;
            return hashCode6 + (tVar != null ? tVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.message;
            String str3 = this.image;
            String str4 = this.imageTintColor;
            String str5 = this.type;
            String str6 = this.lifetime;
            Restriction.ActionButton actionButton = this.actionButton;
            Restriction.Action action = this.action;
            String str7 = this.context;
            Restriction.Progress progress = this.progress;
            t tVar = this.event;
            StringBuilder d11 = C3660k.d("RestrictionVO(title=", str, ", message=", str2, ", image=");
            Nh.a.h(d11, str3, ", imageTintColor=", str4, ", type=");
            Nh.a.h(d11, str5, ", lifetime=", str6, ", actionButton=");
            d11.append(actionButton);
            d11.append(", action=");
            d11.append(action);
            d11.append(", context=");
            d11.append(str7);
            d11.append(", progress=");
            d11.append(progress);
            d11.append(", event=");
            return Tl.b.d(d11, tVar, ")");
        }

        public /* synthetic */ RestrictionVO(String str, String str2, String str3, String str4, String str5, String str6, Restriction.ActionButton actionButton, Restriction.Action action, String str7, Restriction.Progress progress, t tVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : actionButton, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : action, (i11 & 256) != 0 ? null : str7, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : progress, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : tVar);
        }
    }
}
