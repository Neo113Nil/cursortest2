package com.blaze.blazesdk.features.videos.widgets.row;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.blaze.blazesdk.analytics.enums.WidgetType;
import com.blaze.blazesdk.features.videos.widgets.base.BlazeBaseVideosWidget;
import defpackage.c6;
import defpackage.e2m;
import defpackage.mqi;
import defpackage.yj1;
import defpackage.ypa;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/blaze/blazesdk/features/videos/widgets/row/BlazeVideosWidgetRowView;", "Lcom/blaze/blazesdk/features/videos/widgets/base/BlazeBaseVideosWidget;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lcom/blaze/blazesdk/analytics/enums/WidgetType;", "t", "Lcom/blaze/blazesdk/analytics/enums/WidgetType;", "getWidgetType", "()Lcom/blaze/blazesdk/analytics/enums/WidgetType;", "widgetType", "Le2m;", "u", "Ljoa;", "getItemDecoration", "()Le2m;", "itemDecoration", "Landroidx/recyclerview/widget/LinearLayoutManager;", "v", "getWidgetLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "widgetLayoutManager", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeVideosWidgetRowView extends BlazeBaseVideosWidget {
    public static final /* synthetic */ int w = 0;

    /* renamed from: t, reason: from kotlin metadata */
    public final WidgetType widgetType;
    public final mqi u;
    public final mqi v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeVideosWidgetRowView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        this.widgetType = WidgetType.ROW;
        this.u = ypa.b(new yj1(this, 14));
        this.v = ypa.b(new c6(context, 9));
    }

    @Override // com.blaze.blazesdk.widgets.ui.BlazeBaseWidget
    @NotNull
    public e2m getItemDecoration() {
        return (e2m) this.u.getValue();
    }

    @Override // com.blaze.blazesdk.widgets.ui.BlazeBaseWidget
    @NotNull
    public LinearLayoutManager getWidgetLayoutManager() {
        return (LinearLayoutManager) this.v.getValue();
    }

    @Override // com.blaze.blazesdk.widgets.ui.BlazeBaseWidget
    @NotNull
    public WidgetType getWidgetType() {
        return this.widgetType;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeVideosWidgetRowView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeVideosWidgetRowView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ BlazeVideosWidgetRowView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeVideosWidgetRowView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
