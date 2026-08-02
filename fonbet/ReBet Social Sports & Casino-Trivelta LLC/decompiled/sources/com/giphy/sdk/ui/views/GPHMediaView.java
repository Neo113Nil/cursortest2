package com.giphy.sdk.ui.views;

import H7.m;
import Q8.b;
import V8.C1734o;
import V8.EnumC1720a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.react.devsupport.StackTraceHelper;
import com.giphy.sdk.ui.views.GPHMediaView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0015\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lcom/giphy/sdk/ui/views/GPHMediaView;", "Lcom/giphy/sdk/ui/views/GifView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Canvas;", "canvas", "", "onDraw", "(Landroid/graphics/Canvas;)V", "", StackTraceHelper.ID_KEY, "LH7/m;", "imageInfo", "Landroid/graphics/drawable/Animatable;", "anim", "q", "(Ljava/lang/String;LH7/m;Landroid/graphics/drawable/Animatable;)V", "r", "()V", "LQ8/b;", "z", "LQ8/b;", "brandingDrawer", "", "A", "Z", "getShowAttribution", "()Z", "setShowAttribution", "(Z)V", "showAttribution", "LV8/o;", "B", "LV8/o;", "getMediaActionsView", "()LV8/o;", "setMediaActionsView", "(LV8/o;)V", "mediaActionsView", "giphy-ui-2.3.17_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public class GPHMediaView extends GifView {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    public boolean showAttribution;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    public C1734o mediaActionsView;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public b brandingDrawer;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GPHMediaView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final boolean D(GPHMediaView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.mediaActionsView.showAsDropDown(this$0);
        return true;
    }

    @NotNull
    public final C1734o getMediaActionsView() {
        return this.mediaActionsView;
    }

    public final boolean getShowAttribution() {
        return this.showAttribution;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        b bVar;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (!this.showAttribution || (bVar = this.brandingDrawer) == null) {
            return;
        }
        bVar.b(canvas);
    }

    @Override // com.giphy.sdk.ui.views.GifView
    public void q(String id2, m imageInfo, Animatable anim) {
        b bVar;
        super.q(id2, imageInfo, anim);
        invalidate();
        if (!this.showAttribution || (bVar = this.brandingDrawer) == null) {
            return;
        }
        bVar.c();
    }

    @Override // com.giphy.sdk.ui.views.GifView
    public void r() {
        this.mediaActionsView.j(getMedia());
    }

    public final void setMediaActionsView(@NotNull C1734o c1734o) {
        Intrinsics.checkNotNullParameter(c1734o, "<set-?>");
        this.mediaActionsView = c1734o;
    }

    public final void setShowAttribution(boolean z10) {
        this.showAttribution = z10;
    }

    public /* synthetic */ GPHMediaView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GPHMediaView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.showAttribution = true;
        this.brandingDrawer = new b(context);
        this.mediaActionsView = new C1734o(context, new EnumC1720a[]{EnumC1720a.CopyLink, EnumC1720a.OpenGiphy});
        setOnLongClickListener(new View.OnLongClickListener() { // from class: V8.z
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean D10;
                D10 = GPHMediaView.D(GPHMediaView.this, view);
                return D10;
            }
        });
    }
}
