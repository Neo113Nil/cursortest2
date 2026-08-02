package X8;

import V8.V;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC2094j0;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.giphy.sdk.core.models.enums.MediaType;
import com.giphy.sdk.core.models.enums.RatingType;
import com.giphy.sdk.core.models.enums.RenditionType;
import com.giphy.sdk.ui.pagination.GPHContent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class f extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final a f13637e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final RenditionType f13638f = RenditionType.fixedWidth;

    /* renamed from: a, reason: collision with root package name */
    public V f13639a;

    /* renamed from: b, reason: collision with root package name */
    public RenditionType f13640b;

    /* renamed from: c, reason: collision with root package name */
    public RenditionType f13641c;

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f13642d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ f(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final void b(f fVar) {
        fVar.measure(View.MeasureSpec.makeMeasureSpec(fVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(fVar.getHeight(), 1073741824));
        fVar.layout(fVar.getLeft(), fVar.getTop(), fVar.getRight(), fVar.getBottom());
    }

    public final void c() {
        for (View view : AbstractC2094j0.a(getGridView())) {
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.clearDisappearingChildren();
            }
        }
        getGridView().removeAllViews();
        getGridView().clearDisappearingChildren();
        removeAllViews();
    }

    public final void d() {
        Context context = getContext();
        ThemedReactContext themedReactContext = context instanceof ThemedReactContext ? (ThemedReactContext) context : null;
        Context currentActivity = themedReactContext != null ? themedReactContext.getCurrentActivity() : null;
        if (currentActivity == null) {
            currentActivity = getContext();
        }
        Context context2 = currentActivity;
        Intrinsics.checkNotNull(context2);
        setGridView(new V(context2, null, 0, 6, null));
        addView(getGridView());
    }

    @NotNull
    public final V getGridView() {
        V v10 = this.f13639a;
        if (v10 != null) {
            return v10;
        }
        Intrinsics.throwUninitializedPropertyAccessException("gridView");
        return null;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        post(this.f13642d);
    }

    public final void setCellPadding(@Nullable Integer num) {
        if (num != null) {
            getGridView().setCellPadding(num.intValue());
        }
    }

    public final void setClipsPreviewRenditionType(@Nullable String str) {
        RenditionType a10 = Y8.d.f14089a.a(str);
        if (a10 == null) {
            a10 = f13638f;
        }
        this.f13641c = a10;
    }

    public final void setContent(@Nullable ReadableMap readableMap) {
        O8.e eVar;
        GPHContent gPHContent = new GPHContent();
        MediaType mediaType = null;
        String string = readableMap != null ? readableMap.getString("searchQuery") : null;
        String string2 = readableMap != null ? readableMap.getString("requestType") : null;
        String string3 = readableMap != null ? readableMap.getString("mediaType") : null;
        int i10 = 0;
        if (string2 != null) {
            O8.e[] values = O8.e.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    eVar = null;
                    break;
                }
                eVar = values[i11];
                if (Intrinsics.areEqual(eVar.name(), string2)) {
                    break;
                } else {
                    i11++;
                }
            }
            if (eVar == null) {
                eVar = O8.e.search;
            }
            gPHContent.r(eVar);
            if (gPHContent.k() == O8.e.recents) {
                getGridView().setContent(GPHContent.f31771h.getRecents());
                return;
            }
        }
        RatingType a10 = Y8.c.f14088a.a(readableMap != null ? readableMap.getString("rating") : null);
        if (a10 == null) {
            a10 = RatingType.pg13;
        }
        gPHContent.q(a10);
        if (string != null) {
            gPHContent.s(string);
        }
        if (string3 != null) {
            MediaType[] values2 = MediaType.values();
            int length2 = values2.length;
            while (true) {
                if (i10 >= length2) {
                    break;
                }
                MediaType mediaType2 = values2[i10];
                if (Intrinsics.areEqual(mediaType2.name(), string3)) {
                    mediaType = mediaType2;
                    break;
                }
                i10++;
            }
            if (mediaType == null) {
                mediaType = MediaType.gif;
            }
            gPHContent.p(mediaType);
        }
        getGridView().setContent(gPHContent);
    }

    public final void setDisableEmojiVariations(@Nullable Boolean bool) {
        if (bool != null) {
            getGridView().setDisableEmojiVariations(bool.booleanValue());
        }
    }

    public final void setFixedSizeCells(@Nullable Boolean bool) {
        if (bool != null) {
            getGridView().setFixedSizeCells(bool.booleanValue());
        }
    }

    public final void setGridView(@NotNull V v10) {
        Intrinsics.checkNotNullParameter(v10, "<set-?>");
        this.f13639a = v10;
    }

    public final void setOrientation(@Nullable String str) {
        int i10;
        V gridView = getGridView();
        if (Intrinsics.areEqual(str, "horizontal")) {
            i10 = 0;
        } else {
            Intrinsics.areEqual(str, "vertical");
            i10 = 1;
        }
        gridView.setDirection(i10);
    }

    public final void setRenditionType(@Nullable String str) {
        RenditionType a10 = Y8.d.f14089a.a(str);
        if (a10 == null) {
            a10 = f13638f;
        }
        this.f13640b = a10;
    }

    public final void setShowCheckeredBackground(@Nullable Boolean bool) {
        getGridView().setShowCheckeredBackground(bool != null ? bool.booleanValue() : false);
    }

    public final void setSpanCount(@Nullable Integer num) {
        if (num != null) {
            getGridView().setSpanCount(num.intValue());
        }
    }

    public final void setTheme(@Nullable ReadableMap readableMap) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        new l(context, readableMap).a();
        getGridView().setTheme(S8.c.Custom);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        RenditionType renditionType = f13638f;
        this.f13640b = renditionType;
        this.f13641c = renditionType;
        d();
        this.f13642d = new Runnable() { // from class: X8.e
            @Override // java.lang.Runnable
            public final void run() {
                f.b(f.this);
            }
        };
    }
}
