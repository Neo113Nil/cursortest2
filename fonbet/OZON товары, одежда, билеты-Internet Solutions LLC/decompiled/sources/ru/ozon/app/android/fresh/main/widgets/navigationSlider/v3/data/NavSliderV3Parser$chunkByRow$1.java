package ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.data;

import Sc.o;
import Sc.s;
import Wc.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.k;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.data.NavigationSliderV3DTO;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/sequences/k;", "", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Item;", "", "<anonymous>", "(Lkotlin/sequences/k;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.data.NavSliderV3Parser$chunkByRow$1", f = "NavSliderV3Parser.kt", l = {140, 144, 150, 158}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class NavSliderV3Parser$chunkByRow$1 extends i implements Function2<k<? super List<? extends NavigationSliderV3DTO.Item>>, d<? super Unit>, Object> {
    final /* synthetic */ List<NavigationSliderV3DTO.Item> $list;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NavigationSliderV3DTO.PositionType.values().length];
            try {
                iArr[NavigationSliderV3DTO.PositionType.FULL_WIDTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NavigationSliderV3DTO.PositionType.HALF_WIDTH_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NavigationSliderV3DTO.PositionType.HALF_WIDTH_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NavigationSliderV3DTO.PositionType.INVALID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavSliderV3Parser$chunkByRow$1(List<NavigationSliderV3DTO.Item> list, d<? super NavSliderV3Parser$chunkByRow$1> dVar) {
        super(2, dVar);
        this.$list = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        NavSliderV3Parser$chunkByRow$1 navSliderV3Parser$chunkByRow$1 = new NavSliderV3Parser$chunkByRow$1(this.$list, dVar);
        navSliderV3Parser$chunkByRow$1.L$0 = obj;
        return navSliderV3Parser$chunkByRow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(k<? super List<? extends NavigationSliderV3DTO.Item>> kVar, d<? super Unit> dVar) {
        return invoke2((k<? super List<NavigationSliderV3DTO.Item>>) kVar, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
    
        r7.add(r12);
        r12 = kotlin.collections.C7714v.U0(r7);
        r11.L$0 = r8;
        r11.L$1 = r7;
        r11.L$2 = r1;
        r11.label = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b1, code lost:
    
        if (r8.b(r12, r11) != r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c7, code lost:
    
        if (r7.isEmpty() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c9, code lost:
    
        r9 = kotlin.collections.C7714v.U0(r7);
        r11.L$0 = r8;
        r11.L$1 = r7;
        r11.L$2 = r1;
        r11.L$3 = r12;
        r11.label = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00de, code lost:
    
        if (r8.b(r9, r11) != r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e1, code lost:
    
        r9 = r8;
        r8 = r7;
        r7 = r1;
        r1 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0124, code lost:
    
        if (r8.b(r7, r11) == r0) goto L45;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00b1 -> B:14:0x00b5). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        Iterator<NavigationSliderV3DTO.Item> it;
        k kVar;
        NavigationSliderV3DTO.Item item;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            k kVar2 = (k) this.L$0;
            ArrayList arrayList = new ArrayList();
            list = arrayList;
            it = this.$list.iterator();
            kVar = kVar2;
        } else {
            if (i11 == 1) {
                NavigationSliderV3DTO.Item item2 = (NavigationSliderV3DTO.Item) this.L$3;
                Iterator<NavigationSliderV3DTO.Item> it2 = (Iterator) this.L$2;
                List list2 = (List) this.L$1;
                k kVar3 = (k) this.L$0;
                s.b(obj);
                list2.clear();
                item = item2;
                it = it2;
                list = list2;
                kVar = kVar3;
                list.add(item);
                List U02 = C7714v.U0(list);
                this.L$0 = kVar;
                this.L$1 = list;
                this.L$2 = it;
                this.L$3 = null;
                this.label = 2;
                if (kVar.b(U02, this) != aVar) {
                    list.clear();
                }
                return aVar;
            }
            if (i11 == 2) {
                it = (Iterator) this.L$2;
                list = (List) this.L$1;
                kVar = (k) this.L$0;
                s.b(obj);
                list.clear();
            } else {
                if (i11 != 3) {
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                it = (Iterator) this.L$2;
                list = (List) this.L$1;
                kVar = (k) this.L$0;
                s.b(obj);
                list.clear();
            }
        }
        while (true) {
            if (it.hasNext()) {
                item = it.next();
                int i12 = WhenMappings.$EnumSwitchMapping$0[item.getSettings().getPosition().ordinal()];
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 == 3) {
                            break;
                        }
                        if (i12 != 4) {
                            throw new o();
                        }
                    } else {
                        list.add(item);
                    }
                } else {
                    break;
                }
            } else if (!list.isEmpty()) {
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 4;
            }
        }
        return aVar;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(k<? super List<NavigationSliderV3DTO.Item>> kVar, d<? super Unit> dVar) {
        return ((NavSliderV3Parser$chunkByRow$1) create(kVar, dVar)).invokeSuspend(Unit.f71690a);
    }
}
