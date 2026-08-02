package ru.ozon.app.android.search.deeplink;

import android.content.Context;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.M;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.text.h;
import ru.ozon.app.android.composer.network.security.search.DeeplinkUrlsNeedSourceFlag;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class SourceGlobalDeeplinkInterceptor$deeplinksNeedSource$2 extends AbstractC7737t implements Function0<Set<? extends String>> {
    final /* synthetic */ SourceGlobalDeeplinkInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SourceGlobalDeeplinkInterceptor$deeplinksNeedSource$2(SourceGlobalDeeplinkInterceptor sourceGlobalDeeplinkInterceptor) {
        super(0);
        this.this$0 = sourceGlobalDeeplinkInterceptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Set<? extends String> invoke() {
        Context context;
        context = this.this$0.context;
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        String stringKey = ((NetworkComponentApi) dependencyStorage.b(NetworkComponentApi.class)).getFeatureService().getStringKey(DeeplinkUrlsNeedSourceFlag.INSTANCE);
        if (h.K(stringKey)) {
            stringKey = null;
        }
        if (stringKey == null) {
            return M.f71699a;
        }
        List l11 = h.l(stringKey, new char[]{','}, 0, 6);
        ArrayList arrayList = new ArrayList(C7714v.z(l11, 10));
        Iterator it = l11.iterator();
        while (it.hasNext()) {
            arrayList.add(h.X(h.z0((String) it.next()).toString(), "/", "", false));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((String) next).length() > 0) {
                arrayList2.add(next);
            }
        }
        return C7714v.Y0(arrayList2);
    }
}
