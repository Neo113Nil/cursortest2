package ru.ozon.app.android.tabbar.data.local;

import android.content.Context;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TabConfigLocalDataSource$workingDir$2 extends AbstractC7737t implements Function0<File> {
    final /* synthetic */ TabConfigLocalDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TabConfigLocalDataSource$workingDir$2(TabConfigLocalDataSource tabConfigLocalDataSource) {
        super(0);
        this.this$0 = tabConfigLocalDataSource;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final File invoke() {
        Context context;
        context = this.this$0.context;
        File file = new File(context.getFilesDir(), "tab_bar");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
