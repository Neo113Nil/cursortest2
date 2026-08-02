package ru.ozon.app.android.travel.utils.visualTransformation;

import K1.C3422b;
import Q1.D;
import Q1.W;
import Q1.X;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/utils/visualTransformation/MaskVisualTransformation;", "LQ1/X;", "", FormPageDTO.Field.FIELD_TYPE_MASK, "", "maskChar", "<init>", "(Ljava/lang/String;C)V", "", "offset", "", "mapping", "getMappedOffset", "(ILjava/util/List;)I", "LK1/b;", "text", "LQ1/W;", "filter", "(LK1/b;)LQ1/W;", "Ljava/lang/String;", "C", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MaskVisualTransformation implements X {
    private final String mask;
    private final char maskChar;

    /* JADX WARN: Multi-variable type inference failed */
    public MaskVisualTransformation() {
        this(null, (char) 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getMappedOffset(int offset, List<Integer> mapping) {
        return offset < 0 ? ((Number) C7714v.K(mapping)).intValue() : offset >= mapping.size() ? ((Number) C7714v.X(mapping)).intValue() : mapping.get(offset).intValue();
    }

    @Override // Q1.X
    @NotNull
    public W filter(@NotNull C3422b text) {
        Intrinsics.checkNotNullParameter(text, "text");
        String str = this.mask;
        if (str == null || str.length() == 0 || text.h().length() == 0) {
            return new W(text, D.a.a());
        }
        String h11 = text.h();
        StringBuilder sb2 = new StringBuilder();
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        arrayList.add(0);
        arrayList2.add(0);
        StringBuilder sb3 = new StringBuilder();
        int length = this.mask.length();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            if (this.mask.charAt(i13) != this.maskChar) {
                sb3.append(this.mask.charAt(i13));
            } else {
                if (i11 >= h11.length()) {
                    break;
                }
                for (int i14 = 0; i14 < sb3.length(); i14++) {
                    sb2.append(sb3.charAt(i14));
                    i12++;
                    arrayList2.add(Integer.valueOf(i11));
                }
                h.s(sb3);
                sb2.append(h11.charAt(i11));
                i11++;
                i12++;
                arrayList.add(Integer.valueOf(i12));
                arrayList2.add(Integer.valueOf(i11));
            }
        }
        D d11 = new D() { // from class: ru.ozon.app.android.travel.utils.visualTransformation.MaskVisualTransformation$filter$offsetMapping$1
            @Override // Q1.D
            public int originalToTransformed(int offset) {
                int mappedOffset;
                mappedOffset = MaskVisualTransformation.this.getMappedOffset(offset, arrayList);
                return mappedOffset;
            }

            @Override // Q1.D
            public int transformedToOriginal(int offset) {
                int mappedOffset;
                mappedOffset = MaskVisualTransformation.this.getMappedOffset(offset, arrayList2);
                return mappedOffset;
            }
        };
        String sb4 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return new W(new C3422b(6, sb4, null), d11);
    }

    public MaskVisualTransformation(String str, char c11) {
        this.mask = str;
        this.maskChar = c11;
    }

    public /* synthetic */ MaskVisualTransformation(String str, char c11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? '_' : c11);
    }
}
