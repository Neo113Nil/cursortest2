package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;
import ze.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4ViewModel$send$1", f = "HotelsMapInfoV4ViewModel.kt", l = {133}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsMapInfoV4ViewModel$send$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ MapAction[] $actions;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ HotelsMapInfoV4ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsMapInfoV4ViewModel$send$1(MapAction[] mapActionArr, HotelsMapInfoV4ViewModel hotelsMapInfoV4ViewModel, d<? super HotelsMapInfoV4ViewModel$send$1> dVar) {
        super(2, dVar);
        this.$actions = mapActionArr;
        this.this$0 = hotelsMapInfoV4ViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HotelsMapInfoV4ViewModel$send$1(this.$actions, this.this$0, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0045 -> B:5:0x0048). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        HotelsMapInfoV4ViewModel hotelsMapInfoV4ViewModel;
        int length;
        int i11;
        MapAction[] mapActionArr;
        h hVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i12 = this.label;
        if (i12 == 0) {
            s.b(obj);
            MapAction[] mapActionArr2 = this.$actions;
            hotelsMapInfoV4ViewModel = this.this$0;
            length = mapActionArr2.length;
            i11 = 0;
            mapActionArr = mapActionArr2;
            if (i11 < length) {
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            length = this.I$1;
            i11 = this.I$0;
            hotelsMapInfoV4ViewModel = (HotelsMapInfoV4ViewModel) this.L$1;
            mapActionArr = (MapAction[]) this.L$0;
            s.b(obj);
            i11++;
            if (i11 < length) {
                MapAction mapAction = mapActionArr[i11];
                hVar = hotelsMapInfoV4ViewModel.actionChannel;
                this.L$0 = mapActionArr;
                this.L$1 = hotelsMapInfoV4ViewModel;
                this.I$0 = i11;
                this.I$1 = length;
                this.label = 1;
                if (hVar.n(mapAction, this) == aVar) {
                    return aVar;
                }
                i11++;
                if (i11 < length) {
                    return Unit.f71690a;
                }
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((HotelsMapInfoV4ViewModel$send$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
