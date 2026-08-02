package ru.ozon.uni.android.atom.badge.badgeList;

import Jk0.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.core.graphics.c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.atom.badge.BadgeCommonKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0001EB1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001b\u001a\u00020\u00112\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R*\u0010'\u001a\u00020%2\u0006\u0010&\u001a\u00020%8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R*\u0010.\u001a\u00020-2\u0006\u0010&\u001a\u00020-8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00104\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u000e\"\u0004\b7\u00108R\u0014\u00109\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010\u001eR\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R$\u0010A\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010D\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bB\u0010>\"\u0004\bC\u0010@¨\u0006F"}, d2 = {"Lru/ozon/uni/android/atom/badge/badgeList/BadgeListView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "hasInvisibleElements", "()Z", "Landroid/graphics/Canvas;", "canvas", "", "drawMore", "(Landroid/graphics/Canvas;Landroid/graphics/Canvas;)V", "updateItemDecoration", "()V", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badges", "submitBadges", "(Ljava/util/List;)V", "moreFadeWidth", "I", "Lru/ozon/uni/android/atom/badge/badgeList/BadgeListAdapter;", "badgeListAdapter", "Lru/ozon/uni/android/atom/badge/badgeList/BadgeListAdapter;", "Lru/ozon/uni/android/atom/badge/badgeList/BadgeListPaddingsItemDecoration;", "badgeHorizontalItemDecoration", "Lru/ozon/uni/android/atom/badge/badgeList/BadgeListPaddingsItemDecoration;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$BadgeSize;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "badgesSize", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$BadgeSize;", "getBadgesSize", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$BadgeSize;", "setBadgesSize", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$BadgeSize;)V", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$Style;", "badgesStyle", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$Style;", "getBadgesStyle", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$Style;", "setBadgesStyle", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$Style;)V", "fadeEnabled", "Z", "getFadeEnabled", "setFadeEnabled", "(Z)V", "moreFadeColor", "Landroid/graphics/drawable/GradientDrawable;", "moreGradientDrawable", "Landroid/graphics/drawable/GradientDrawable;", "getGap", "()I", "setGap", "(I)V", "gap", "getLeftPadding", "setLeftPadding", "leftPadding", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BadgeListView extends RecyclerView implements AtomView {

    @NotNull
    private final BadgeListPaddingsItemDecoration badgeHorizontalItemDecoration;

    @NotNull
    private final BadgeListAdapter badgeListAdapter;

    @NotNull
    private BadgeDTO.BadgeSize badgesSize;

    @NotNull
    private BadgeDTO.Style badgesStyle;
    private boolean fadeEnabled;
    private final int moreFadeColor;
    private final int moreFadeWidth;

    @NotNull
    private final GradientDrawable moreGradientDrawable;
    public static final int $stable = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BadgeListView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void drawMore(Canvas canvas, Canvas canvas2) {
        this.moreGradientDrawable.setBounds((canvas.getWidth() - this.moreFadeWidth) - getPaddingRight(), 0, canvas.getWidth() - getPaddingRight(), canvas.getHeight());
        this.moreGradientDrawable.draw(canvas2);
    }

    private final boolean hasInvisibleElements() {
        RecyclerView.o layoutManager = getLayoutManager();
        Intrinsics.g(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        return ((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition() < this.badgeListAdapter.getItemCount() + (-1);
    }

    private final void updateItemDecoration() {
        post(new a(this, 2));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (hasInvisibleElements() && this.fadeEnabled) {
            drawMore(canvas, canvas);
        }
    }

    @NotNull
    public final BadgeDTO.BadgeSize getBadgesSize() {
        return this.badgesSize;
    }

    public final void setBadgesSize(@NotNull BadgeDTO.BadgeSize value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.badgesSize = value;
        List<BadgeDTO> currentList = this.badgeListAdapter.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        submitBadges(currentList);
    }

    public final void setBadgesStyle(@NotNull BadgeDTO.Style value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.badgesStyle = value;
        List<BadgeDTO> currentList = this.badgeListAdapter.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        submitBadges(currentList);
    }

    public final void setFadeEnabled(boolean z11) {
        this.fadeEnabled = z11;
    }

    public final void setGap(int i11) {
        this.badgeHorizontalItemDecoration.setGap(i11);
        updateItemDecoration();
    }

    public final void setLeftPadding(int i11) {
        this.badgeHorizontalItemDecoration.setLeftPadding(i11);
        updateItemDecoration();
    }

    public final void submitBadges(@NotNull List<BadgeDTO> badges) {
        Intrinsics.checkNotNullParameter(badges, "badges");
        List<BadgeDTO> list = badges;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (BadgeDTO badgeDTO : list) {
            BadgeDTO.Style styleType = badgeDTO.getStyleType();
            if (styleType == null) {
                styleType = this.badgesStyle;
            }
            arrayList.add(BadgeDTO.copy$default(badgeDTO, null, null, this.badgesSize, null, null, null, null, null, styleType, null, null, null, 3835, null));
        }
        this.badgeListAdapter.submitList(arrayList);
    }

    public /* synthetic */ BadgeListView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeListView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.moreFadeWidth = UiExtKt.toPx(40);
        BadgeListAdapter badgeListAdapter = new BadgeListAdapter();
        this.badgeListAdapter = badgeListAdapter;
        BadgeListPaddingsItemDecoration badgeListPaddingsItemDecoration = new BadgeListPaddingsItemDecoration(UiExtKt.toPx(4.0f), 0, 2, null);
        this.badgeHorizontalItemDecoration = badgeListPaddingsItemDecoration;
        BadgeDTO.BadgeSize badgeSize = BadgeDTO.BadgeSize.SIZE_500;
        this.badgesSize = badgeSize;
        this.badgesStyle = BadgeDTO.Style.NEUTRAL_SECONDARY;
        this.fadeEnabled = true;
        int color = androidx.core.content.a.getColor(context, R$color.layer_floor_1);
        this.moreFadeColor = color;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{c.f(color, 0), c.f(color, UserVerificationMethods.USER_VERIFY_PATTERN), color, color, color});
        gradientDrawable.setShape(0);
        gradientDrawable.setGradientType(0);
        this.moreGradientDrawable = gradientDrawable;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BadgeListView, i11, i12);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        setGap(UiExtKt.toPx(obtainStyledAttributes.getDimension(R$styleable.BadgeListView_badgesGap, 4.0f)));
        setBadgesSize(((BadgeDTO.BadgeSize[]) BadgeDTO.BadgeSize.getEntries().toArray(new BadgeDTO.BadgeSize[0]))[obtainStyledAttributes.getInt(R$styleable.BadgeListView_badgesSize, badgeSize.ordinal())]);
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.BadgeListView_badgesStyle, 0);
        if (resourceId != 0) {
            setBadgesStyle(BadgeCommonKt.getListStyleByResId(resourceId));
        }
        obtainStyledAttributes.recycle();
        setAdapter(badgeListAdapter);
        setHorizontalScrollBarEnabled(false);
        setLayoutManager(new LinearLayoutManager(getContext()) { // from class: ru.ozon.uni.android.atom.badge.badgeList.BadgeListView.1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
            public boolean canScrollHorizontally() {
                return false;
            }
        });
        addItemDecoration(badgeListPaddingsItemDecoration);
    }
}
