package ru.ozon.app.android.pikazon.image;

import B0.A0;
import Lm0.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.text.h;
import ru.ozon.app.android.pikazon.Pikazon;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ImageSizeOptimizer$imageSizeBuckets$2 extends AbstractC7737t implements Function0<List<? extends Integer>> {
    public static final ImageSizeOptimizer$imageSizeBuckets$2 INSTANCE = new ImageSizeOptimizer$imageSizeBuckets$2();

    ImageSizeOptimizer$imageSizeBuckets$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends Integer> invoke() {
        String imageBuckets = Pikazon.INSTANCE.getInstance().getConfig().getImageBuckets();
        try {
            List l11 = h.l(imageBuckets, new char[]{','}, 0, 6);
            ArrayList arrayList = new ArrayList(C7714v.z(l11, 10));
            Iterator it = l11.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(Integer.parseInt(h.z0((String) it.next()).toString())));
            }
            return arrayList;
        } catch (Exception unused) {
            a.f17149a.e(A0.b("Can't parse imageBuckets=", imageBuckets, " to integer's list"), new Object[0]);
            return K.f71697a;
        }
    }
}
