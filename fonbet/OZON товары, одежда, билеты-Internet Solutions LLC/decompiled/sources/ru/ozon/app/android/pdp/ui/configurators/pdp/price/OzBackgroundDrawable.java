package ru.ozon.app.android.pdp.ui.configurators.pdp.price;

import Sc.o;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.pdp.price.Background;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010*\b\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/price/OzBackgroundDrawable;", "Landroid/graphics/drawable/GradientDrawable;", "context", "Landroid/content/Context;", "background", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/Background;", "cornerRadius", "", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/pdp/ui/configurators/pdp/price/Background;F)V", "extractGradientProperties", "Lkotlin/Pair;", "Landroid/graphics/drawable/GradientDrawable$Orientation;", "", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/Background$Gradient;", "parseColors", "", "", "", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OzBackgroundDrawable extends GradientDrawable {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Background.Orientation.values().length];
            try {
                iArr[Background.Orientation.LEFT_RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Background.Orientation.TOP_BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Background.Orientation.TOP_LEFT_RIGHT_BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Background.Orientation.TOP_RIGHT_LEFT_BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public OzBackgroundDrawable(@NotNull Context context, @NotNull Background background, float f7) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(background, "background");
        setShape(0);
        setCornerRadius(f7);
        if (background instanceof Background.Solid) {
            setColor(StyleParser.INSTANCE.parseColor(context, ((Background.Solid) background).getColor(), UniColors.BG_POSITIVE_PRIMARY.getResId()));
        } else {
            if (!(background instanceof Background.Gradient)) {
                throw new o();
            }
            Pair<GradientDrawable.Orientation, int[]> extractGradientProperties = extractGradientProperties((Background.Gradient) background, context);
            GradientDrawable.Orientation a11 = extractGradientProperties.a();
            setColors(extractGradientProperties.b());
            setOrientation(a11);
        }
    }

    private final Pair<GradientDrawable.Orientation, int[]> extractGradientProperties(Background.Gradient gradient, Context context) {
        int[] T02 = C7714v.T0(parseColors(gradient.getColors(), context));
        int i11 = WhenMappings.$EnumSwitchMapping$0[gradient.getOrientation().ordinal()];
        if (i11 == 1) {
            return new Pair<>(GradientDrawable.Orientation.LEFT_RIGHT, T02);
        }
        if (i11 == 2) {
            return new Pair<>(GradientDrawable.Orientation.TOP_BOTTOM, T02);
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return new Pair<>(GradientDrawable.Orientation.TR_BL, T02);
            }
            throw new o();
        }
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.BR_TL;
        Intrinsics.checkNotNullParameter(T02, "<this>");
        int length = (T02.length / 2) - 1;
        if (length >= 0) {
            Intrinsics.checkNotNullParameter(T02, "<this>");
            int length2 = T02.length - 1;
            if (length >= 0) {
                int i12 = 0;
                while (true) {
                    int i13 = T02[i12];
                    T02[i12] = T02[length2];
                    T02[length2] = i13;
                    length2--;
                    if (i12 == length) {
                        break;
                    }
                    i12++;
                }
            }
        }
        return new Pair<>(orientation, T02);
    }

    private final List<Integer> parseColors(List<String> list, Context context) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Integer parseColor = StyleParser.INSTANCE.parseColor(context, (String) it.next());
            if (parseColor != null) {
                arrayList.add(parseColor);
            }
        }
        return arrayList;
    }
}
