package ru.ozon.app.android.debugmenu.ozondebugmenu.support;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.debugmenu.ozondebugmenu.support.OzonDebugMenuEvents", f = "OzonDebugMenuEvents.kt", l = {21, DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m = "onClearCookie")
/* loaded from: classes11.dex */
final class OzonDebugMenuEvents$onClearCookie$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OzonDebugMenuEvents this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OzonDebugMenuEvents$onClearCookie$1(OzonDebugMenuEvents ozonDebugMenuEvents, d<? super OzonDebugMenuEvents$onClearCookie$1> dVar) {
        super(dVar);
        this.this$0 = ozonDebugMenuEvents;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.onClearCookie(this);
    }
}
