package ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.data;

import Sc.o;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.l;
import kotlin.sequences.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.ui.molecules.header.HeaderV2DTO;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.data.NavigationSliderV3DTO;
import sf.C9681g;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002.\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003`\u0005B\u0011\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00030\u00032\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0003H\u0002¢\u0006\u0004\b\u001f\u0010 J*\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010!\u001a\u0004\u0018\u00010\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavSliderV3Parser;", "Lkotlin/Function2;", "", "", "", "Lru/ozon/app/android/composer/widgets/base/WidgetParser;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Section;", "section", "", "appendInnerItem", "(Ljava/util/List;Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Section;)V", "", "size", "index", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$RowType;", "defineRowType", "(II)Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$RowType;", "rowType", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Corners;", "corners", "", "hasHeader", "defineCorners", "(Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$RowType;Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Corners;Z)Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Corners;", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Item;", "list", "chunkByRow", "(Ljava/util/List;)Ljava/util/List;", "params", "state", "invoke", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "Lcom/squareup/moshi/n$a;", "jsonDTONames", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/SectionJsonAdapter;", "sectionDTOJsonAdapter", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/SectionJsonAdapter;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NavSliderV3Parser implements Function2<String, String, List<? extends Object>> {

    @NotNull
    private final n.a jsonDTONames;

    @NotNull
    private final SectionJsonAdapter sectionDTOJsonAdapter;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NavigationSliderV3DTO.RowType.values().length];
            try {
                iArr[NavigationSliderV3DTO.RowType.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NavigationSliderV3DTO.RowType.FIRST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NavigationSliderV3DTO.RowType.LAST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NavigationSliderV3DTO.RowType.DEFAULT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NavSliderV3Parser(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        NavigationSliderV3DTO.DtoFieldName[] values = NavigationSliderV3DTO.DtoFieldName.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (NavigationSliderV3DTO.DtoFieldName dtoFieldName : values) {
            arrayList.add(dtoFieldName.getJsonName());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.jsonDTONames = n.a.C0918a.a((String[]) Arrays.copyOf(strArr, strArr.length));
        this.sectionDTOJsonAdapter = new SectionJsonAdapter(moshi);
    }

    private final void appendInnerItem(List<Object> list, NavigationSliderV3DTO.Section section) {
        if (section.getSeparatorHeight() != null) {
            list.add(new NavigationSliderV3DTO.SeparatorDTO(section.getSeparatorHeight().intValue()));
        } else {
            HeaderV2DTO header = section.getHeader();
            if (header != null) {
                header.setBackgroundColor(section.getBackgroundColor());
            }
            HeaderV2DTO header2 = section.getHeader();
            if (header2 != null) {
                list.add(header2);
            }
        }
        List<NavigationSliderV3DTO.Item> items = section.getItems();
        if (items != null) {
            List<List<NavigationSliderV3DTO.Item>> chunkByRow = chunkByRow(items);
            int i11 = 0;
            for (Object obj : chunkByRow) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                List list2 = (List) obj;
                NavigationSliderV3DTO.Item item = (NavigationSliderV3DTO.Item) C7714v.K(list2);
                NavigationSliderV3DTO.Item item2 = (NavigationSliderV3DTO.Item) C7714v.Q(1, list2);
                NavigationSliderV3DTO.RowType defineRowType = defineRowType(chunkByRow.size() - 1, i11);
                NavigationSliderV3DTO.Corners corners = section.getCorners();
                if (corners == null) {
                    corners = NavigationSliderV3DTO.Corners.WITHOUT;
                }
                list.add(new NavigationSliderV3DTO.NavigationSliderV3RowDTO(item, item2, defineRowType, defineCorners(defineRowType, corners, section.getHeader() != null), section.getHeader() != null, section.getBackgroundColor()));
                i11 = i12;
            }
        }
    }

    private final List<List<NavigationSliderV3DTO.Item>> chunkByRow(List<NavigationSliderV3DTO.Item> list) {
        NavSliderV3Parser$chunkByRow$1 block = new NavSliderV3Parser$chunkByRow$1(list, null);
        Intrinsics.checkNotNullParameter(block, "block");
        return l.C(new m(block));
    }

    private final NavigationSliderV3DTO.Corners defineCorners(NavigationSliderV3DTO.RowType rowType, NavigationSliderV3DTO.Corners corners, boolean hasHeader) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[rowType.ordinal()];
        if (i11 == 1) {
            if (!hasHeader) {
                return corners;
            }
            NavigationSliderV3DTO.Corners corners2 = NavigationSliderV3DTO.Corners.BOTTOM;
            return C7705l.m(new NavigationSliderV3DTO.Corners[]{corners2, NavigationSliderV3DTO.Corners.FULL}, corners) ? corners2 : NavigationSliderV3DTO.Corners.WITHOUT;
        }
        if (i11 == 2) {
            NavigationSliderV3DTO.Corners corners3 = NavigationSliderV3DTO.Corners.TOP;
            return (corners != corners3 || hasHeader) ? NavigationSliderV3DTO.Corners.WITHOUT : corners3;
        }
        if (i11 == 3) {
            NavigationSliderV3DTO.Corners corners4 = NavigationSliderV3DTO.Corners.BOTTOM;
            return (corners == corners4 || corners == NavigationSliderV3DTO.Corners.FULL) ? corners4 : NavigationSliderV3DTO.Corners.WITHOUT;
        }
        if (i11 == 4) {
            return NavigationSliderV3DTO.Corners.WITHOUT;
        }
        throw new o();
    }

    private final NavigationSliderV3DTO.RowType defineRowType(int size, int index) {
        return size > 0 ? index == 0 ? NavigationSliderV3DTO.RowType.FIRST : index == size ? NavigationSliderV3DTO.RowType.LAST : NavigationSliderV3DTO.RowType.DEFAULT : NavigationSliderV3DTO.RowType.SINGLE;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<Object> invoke(String params, String state) {
        ArrayList arrayList = new ArrayList();
        C9681g source = new C9681g();
        if (state == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        source.H0(state);
        Intrinsics.checkNotNullParameter(source, "source");
        p pVar = new p(source);
        pVar.beginObject();
        Object obj = null;
        while (pVar.hasNext()) {
            if (pVar.v(this.jsonDTONames) == NavigationSliderV3DTO.DtoFieldName.SECTIONS.ordinal()) {
                obj = C10727i.d(C10720e0.a(), new NavSliderV3Parser$invoke$1$1(pVar, this, null));
            } else {
                pVar.skipValue();
            }
        }
        pVar.endObject();
        List list = (List) obj;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                appendInnerItem(arrayList, (NavigationSliderV3DTO.Section) it.next());
            }
        }
        return arrayList;
    }
}
