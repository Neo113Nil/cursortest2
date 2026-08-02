package ru.ozon.app.android.fresh.feature.b2b.widgets.docsTableV2.core;

import e10.AbstractC6252b;
import j20.C7244b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsTableV2.data.DocsTableV2DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00142\u00060\u0001j\u0002`\u0002:\u0001\u0014B\u0015\b\u0007\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTableV2/core/DocsTableV2Config;", "Le10/b;", "Lru/ozon/app/android/composer/widgets/base/config/list/ListConfig;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "deserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lj20/b;", "state", "", "", "parse", "(Lj20/b;)Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "", "supportedVersions", "[J", "getSupportedVersions", "()[J", "Companion", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DocsTableV2Config extends AbstractC6252b {

    @NotNull
    private final JsonParser deserializer;

    @NotNull
    private final long[] supportedVersions;
    public static final int $stable = 8;

    public DocsTableV2Config(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.deserializer = deserializer;
        this.supportedVersions = new long[]{2};
    }

    @Override // e10.AbstractC6252b, j20.InterfaceC7243a
    @NotNull
    public long[] getSupportedVersions() {
        return this.supportedVersions;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public List<? extends Object> parse(@NotNull C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        JsonParser jsonParser = this.deserializer;
        String b11 = state.b();
        if (b11 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        DocsTableV2DTO docsTableV2DTO = (DocsTableV2DTO) jsonParser.fromJson(b11, DocsTableV2DTO.class);
        ArrayList arrayList = new ArrayList();
        TextDTO listTitle = docsTableV2DTO.getListTitle();
        if (listTitle != null) {
            arrayList.add(new DocsTableV2DTO.DocsTitle(listTitle, false, 2, null));
        }
        for (DocsTableV2DTO.Period period : docsTableV2DTO.getPeriods()) {
            TextDTO periodTitle = period.getPeriodTitle();
            if (periodTitle != null) {
                arrayList.add(new DocsTableV2DTO.DocsTitle(periodTitle, true));
            }
            Iterator<T> it = period.getDocuments().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList;
    }
}
