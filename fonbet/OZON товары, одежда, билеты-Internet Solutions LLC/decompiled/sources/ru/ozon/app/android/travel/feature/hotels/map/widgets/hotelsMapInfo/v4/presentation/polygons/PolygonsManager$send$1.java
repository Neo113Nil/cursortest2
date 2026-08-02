package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.polygons;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.MapAction;
import xe.M;
import ze.x;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.polygons.PolygonsManager$send$1", f = "PolygonsManager.kt", l = {63}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PolygonsManager$send$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ MapAction[] $actions;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PolygonsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PolygonsManager$send$1(MapAction[] mapActionArr, PolygonsManager polygonsManager, d<? super PolygonsManager$send$1> dVar) {
        super(2, dVar);
        this.$actions = mapActionArr;
        this.this$0 = polygonsManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new PolygonsManager$send$1(this.$actions, this.this$0, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0045 -> B:5:0x0048). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PolygonsManager polygonsManager;
        int length;
        int i11;
        MapAction[] mapActionArr;
        x xVar;
        a aVar = a.COROUTINE_SUSPENDED;
        int i12 = this.label;
        if (i12 == 0) {
            s.b(obj);
            MapAction[] mapActionArr2 = this.$actions;
            polygonsManager = this.this$0;
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
            polygonsManager = (PolygonsManager) this.L$1;
            mapActionArr = (MapAction[]) this.L$0;
            s.b(obj);
            i11++;
            if (i11 < length) {
                MapAction mapAction = mapActionArr[i11];
                xVar = polygonsManager.actionChannel;
                this.L$0 = mapActionArr;
                this.L$1 = polygonsManager;
                this.I$0 = i11;
                this.I$1 = length;
                this.label = 1;
                if (xVar.n(mapAction, this) == aVar) {
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
        return ((PolygonsManager$send$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
