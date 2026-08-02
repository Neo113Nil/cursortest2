package ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data.LegalDetailsEditorRepositoryImpl", f = "LegalDetailsEditorRepositoryImpl.kt", l = {DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m = "sendAllEdit")
/* loaded from: classes12.dex */
final class LegalDetailsEditorRepositoryImpl$sendAllEdit$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LegalDetailsEditorRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegalDetailsEditorRepositoryImpl$sendAllEdit$1(LegalDetailsEditorRepositoryImpl legalDetailsEditorRepositoryImpl, d<? super LegalDetailsEditorRepositoryImpl$sendAllEdit$1> dVar) {
        super(dVar);
        this.this$0 = legalDetailsEditorRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.sendAllEdit(null, null, this);
    }
}
