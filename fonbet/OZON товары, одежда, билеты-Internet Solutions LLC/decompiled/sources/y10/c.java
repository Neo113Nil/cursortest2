package y10;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.R;

/* loaded from: classes7.dex */
final class c extends AbstractC7737t implements Function0<String> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f105914b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(i iVar) {
        super(0);
        this.f105914b = iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        l10.i iVar;
        iVar = this.f105914b.f105924a;
        return iVar.Y().getContext().getString(R.string.common_tag_require_reposition);
    }
}
