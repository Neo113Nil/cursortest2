package com.vk.clips.design.view.favorites.folder;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.favorites.design.R$styleable;
import com.vk.core.view.components.picture.VkPicture;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.asp;
import xsna.baf0;
import xsna.dbg0;
import xsna.e43;
import xsna.epx;
import xsna.hny;
import xsna.j5g;
import xsna.t0v0;
import xsna.wng0;
import xsna.y9g0;
import xsna.zrp;

/* compiled from: ClipsFoldersCoverView.kt */
/* loaded from: classes16.dex */
public final class ClipsFoldersCoverView extends FrameLayout {
    public Size b;
    public List<? extends a> c;
    public c d;
    public int e;
    public float f;
    public int g;
    public int h;
    public int i;
    public int j;
    public Path k;
    public boolean l;
    public final ArrayList m;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsFoldersCoverView.kt */
    public static final class Size {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size NORMAL;
        public static final Size SMALL;

        static {
            Size size = new Size("SMALL", 0);
            SMALL = size;
            Size size2 = new Size("NORMAL", 1);
            NORMAL = size2;
            Size[] sizeArr = {size, size2};
            $VALUES = sizeArr;
            $ENTRIES = new asp(sizeArr);
        }

        public Size() {
            throw null;
        }

        public static zrp<Size> h() {
            return $ENTRIES;
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }
    }

    /* compiled from: ClipsFoldersCoverView.kt */
    public interface a {
        String a(int i);
    }

    /* compiled from: ClipsFoldersCoverView.kt */
    public interface b {
        void a(String str);

        void b(float f);

        VkPicture getView();
    }

    /* compiled from: ClipsFoldersCoverView.kt */
    public interface c {
        t0v0.a create(Context context);
    }

    /* compiled from: ClipsFoldersCoverView.kt */
    public final class d extends ViewOutlineProvider {
        public d() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            ClipsFoldersCoverView clipsFoldersCoverView = ClipsFoldersCoverView.this;
            if (!clipsFoldersCoverView.m.isEmpty()) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), clipsFoldersCoverView.f + clipsFoldersCoverView.g);
            } else {
                int i = clipsFoldersCoverView.g;
                outline.setRoundRect(i, i, view.getWidth() - clipsFoldersCoverView.g, view.getHeight() - clipsFoldersCoverView.g, clipsFoldersCoverView.f);
            }
        }
    }

    /* compiled from: ClipsFoldersCoverView.kt */
    public static final /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Size.values().length];
            try {
                iArr[Size.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Size.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ClipsFoldersCoverView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final void setBorderSize(int i) {
        if (this.g != i) {
            this.g = i;
            e();
        }
    }

    private final void setCornerRadius(float f) {
        if (this.f == f) {
            return;
        }
        this.f = f;
        e();
    }

    private final void setEmptyBackgroundColor(int i) {
        if (this.h != i) {
            this.h = i;
            e();
        }
    }

    private final void setEmptyIconSize(int i) {
        if (this.j != i) {
            this.j = i;
            e();
        }
    }

    private final void setEmptyIconTintColor(int i) {
        if (this.i != i) {
            this.i = i;
            e();
        }
    }

    public final int a(Size size) {
        int i = e.$EnumSwitchMapping$0[size.ordinal()];
        if (i == 1) {
            return getContext().getResources().getDimensionPixelSize(R.dimen.clips_favorites_folder_small_border_size);
        }
        if (i == 2) {
            return getContext().getResources().getDimensionPixelSize(R.dimen.clips_favorites_folder_normal_border_size);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final float b(Size size) {
        int i = e.$EnumSwitchMapping$0[size.ordinal()];
        if (i == 1) {
            return getContext().getResources().getDimension(R.dimen.clips_favorites_folder_small_corner_radius);
        }
        if (i == 2) {
            return getContext().getResources().getDimension(R.dimen.clips_favorites_folder_normal_corner_radius);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int c(Size size) {
        int i = e.$EnumSwitchMapping$0[size.ordinal()];
        if (i == 1) {
            return getContext().getResources().getDimensionPixelSize(R.dimen.clips_favorites_folder_small_icon_size);
        }
        if (i == 2) {
            return getContext().getResources().getDimensionPixelSize(R.dimen.clips_favorites_folder_normal_icon_size);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void d() {
        Drawable drawable;
        if (this.l) {
            this.l = false;
            ArrayList<b> arrayList = this.m;
            if (arrayList.isEmpty()) {
                if (this.e != 0) {
                    Resources resources = getContext().getResources();
                    int i = this.e;
                    Resources.Theme theme = getContext().getTheme();
                    ThreadLocal<TypedValue> threadLocal = dbg0.a;
                    drawable = resources.getDrawable(i, theme);
                } else {
                    drawable = null;
                }
                hny hnyVar = new hny(getContext());
                hnyVar.b(new hny.b(this.h, this.f));
                if (drawable != null) {
                    int i2 = this.j;
                    hnyVar.b(new baf0(new y9g0(drawable, i2, i2), this.i));
                }
                setBackground(new InsetDrawable((Drawable) hnyVar, this.g));
            } else {
                setBackground(new wng0(g(R.attr.vk_ui_background_content), ((int) this.f) + this.g));
                for (b bVar : arrayList) {
                    VkPicture view = bVar.getView();
                    int i3 = this.g;
                    view.setPadding(i3, i3, i3, i3);
                    bVar.b(this.f);
                }
            }
            setPadding(0, 0, 0, 0);
            invalidateOutline();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Path path = this.k;
        if (path == null) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        canvas.clipPath(path);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    public final void e() {
        if (this.l) {
            return;
        }
        this.l = true;
        requestLayout();
    }

    public final void f() {
        t0v0.a aVar;
        removeAllViews();
        ArrayList arrayList = this.m;
        arrayList.clear();
        for (a aVar2 : j5g.H0(this.c, 3)) {
            c cVar = this.d;
            if (cVar != null) {
                aVar = cVar.create(getContext());
                VkPicture vkPicture = aVar.a;
                vkPicture.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                int i = this.g;
                vkPicture.setPadding(i, i, i, i);
                aVar.b(this.f);
                vkPicture.setBackground(new wng0(g(R.attr.vk_ui_background_content), ((int) this.f) + this.g));
            } else {
                aVar = null;
            }
            if (aVar != null) {
                arrayList.add(aVar);
                addView(aVar.a);
            }
        }
    }

    public final int g(int i) {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.data;
        }
        return 0;
    }

    public final List<a> getCoverImages() {
        return this.c;
    }

    public final int getEmptyIconResId() {
        return this.e;
    }

    public final c getImageControllerFactory() {
        return this.d;
    }

    public final Size getSize() {
        return this.b;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        d();
        super.onLayout(z, i, i2, i3, i4);
        float width = (getWidth() / 2.0f) - this.g;
        List H0 = j5g.H0(this.m, 3);
        int i5 = 0;
        for (Object obj : j5g.y0(H0)) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                e43.t();
                throw null;
            }
            b bVar = (b) obj;
            VkPicture view = bVar.getView();
            a aVar = (a) j5g.b0(i5, this.c);
            if (aVar != null) {
                bVar.a(aVar.a(getWidth()));
                view.setTranslationX(i5 == e43.h(H0) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : i5 == 0 ? -width : (-width) / 2.0f);
                view.setVisibility(0);
            } else {
                view.setVisibility(8);
            }
            i5 = i6;
        }
        if (z) {
            Path path = new Path();
            float f = this.g;
            float f2 = this.f;
            path.addRoundRect(f, f, getWidth() - this.g, getHeight() - this.g, f2, f2, Path.Direction.CW);
            this.k = path;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        if (r2 > r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
    
        if (r1 > r2) goto L20;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int dimensionPixelSize;
        int i3 = e.$EnumSwitchMapping$0[this.b.ordinal()];
        if (i3 == 1) {
            dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.clips_favorites_folder_small_size);
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.clips_favorites_folder_normal_size);
        }
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode != 0 || mode2 != 0) {
            if ((mode != 0 || mode2 != Integer.MIN_VALUE) && (mode != 0 || mode2 != 1073741824)) {
                if (mode != Integer.MIN_VALUE || mode2 != 0) {
                    if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
                        int min = Math.min(size, size2);
                        if (dimensionPixelSize > min) {
                            dimensionPixelSize = min;
                        }
                    } else if (mode != Integer.MIN_VALUE || mode2 != 1073741824) {
                        if (mode != 1073741824 || mode2 != 0) {
                            if (mode != 1073741824 || mode2 != Integer.MIN_VALUE) {
                                if (mode == 1073741824 && mode2 == 1073741824) {
                                    dimensionPixelSize = Math.min(size, size2);
                                }
                            }
                        }
                    }
                }
                dimensionPixelSize = size;
            }
            dimensionPixelSize = size2;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dimensionPixelSize, 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public final void setCoverImages(List<? extends a> list) {
        if (epx.f(this.c, list)) {
            return;
        }
        this.c = list;
        f();
        e();
        requestLayout();
    }

    public final void setEmptyIconResId(int i) {
        if (this.e != i) {
            this.e = i;
            e();
        }
    }

    public final void setImageControllerFactory(c cVar) {
        if (epx.f(this.d, cVar)) {
            return;
        }
        this.d = cVar;
        f();
        e();
        requestLayout();
    }

    public final void setSize(Size size) {
        if (this.b != size) {
            this.b = size;
            setCornerRadius(b(size));
            setBorderSize(a(this.b));
            setEmptyIconSize(c(this.b));
            e();
            requestLayout();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClipsFoldersCoverView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        Size size = Size.NORMAL;
        this.b = size;
        this.c = EmptyList.b;
        this.f = b(size);
        this.g = a(this.b);
        this.j = c(this.b);
        this.l = true;
        this.m = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a);
        setSize((Size) Size.h().get(obtainStyledAttributes.getInteger(1, 1)));
        setEmptyBackgroundColor(g(R.attr.vk_ui_background_secondary));
        setEmptyIconTintColor(g(R.attr.vk_ui_icon_tertiary));
        setEmptyIconResId(obtainStyledAttributes.getResourceId(0, 0));
        setOutlineProvider(new d());
        setClipToOutline(true);
        d();
    }
}
