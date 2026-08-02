package ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.di;

import Jb.e;
import Jb.j;
import com.squareup.moshi.Moshi;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3Parser;

/* loaded from: classes6.dex */
public final class HammersV3WidgetModule_ProvideParserFactory implements e<HammersV3Parser> {
    public static HammersV3Parser provideParser(Moshi moshi) {
        HammersV3Parser provideParser = HammersV3WidgetModule.INSTANCE.provideParser(moshi);
        j.d(provideParser);
        return provideParser;
    }
}
