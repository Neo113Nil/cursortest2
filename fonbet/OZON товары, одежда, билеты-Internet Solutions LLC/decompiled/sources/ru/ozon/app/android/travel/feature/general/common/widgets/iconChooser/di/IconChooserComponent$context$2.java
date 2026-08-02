package ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.di;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/content/Context;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class IconChooserComponent$context$2 extends AbstractC7737t implements Function0<Context> {
    final /* synthetic */ IconChooserComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IconChooserComponent$context$2(IconChooserComponent iconChooserComponent) {
        super(0);
        this.this$0 = iconChooserComponent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Context invoke() {
        ContextComponentDependencies contextComponentDependencies;
        contextComponentDependencies = this.this$0.getContextComponentDependencies();
        return contextComponentDependencies.getContext();
    }
}
