package ru.ozon.app.android.whitelist.common.utils;

import Tc.j;
import ZY.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/whitelist/common/utils/CdnChooserSdkWhiteListDomainDelegate;", "", "<init>", "()V", "LZY/a;", "cdnConfig", "", "", "getWhitelistDomains", "(LZY/a;)Ljava/util/Set;", "whitelist_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CdnChooserSdkWhiteListDomainDelegate {

    @NotNull
    public static final CdnChooserSdkWhiteListDomainDelegate INSTANCE = new CdnChooserSdkWhiteListDomainDelegate();

    private CdnChooserSdkWhiteListDomainDelegate() {
    }

    @NotNull
    public final Set<String> getWhitelistDomains(@NotNull a cdnConfig) {
        Intrinsics.checkNotNullParameter(cdnConfig, "cdnConfig");
        j builder = new j();
        ArrayList a11 = cdnConfig.a();
        ArrayList arrayList = new ArrayList(C7714v.z(a11, 10));
        Iterator it = a11.iterator();
        while (it.hasNext()) {
            arrayList.add(((a.AbstractC0673a) it.next()).a());
        }
        builder.addAll(C7714v.Y0(arrayList));
        ArrayList a12 = cdnConfig.a();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = a12.iterator();
        while (it2.hasNext()) {
            String b11 = ((a.AbstractC0673a) it2.next()).b();
            if (b11 != null) {
                arrayList2.add(b11);
            }
        }
        builder.addAll(C7714v.Y0(arrayList2));
        ArrayList a13 = cdnConfig.a();
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = a13.iterator();
        while (it3.hasNext()) {
            String c11 = ((a.AbstractC0673a) it3.next()).c();
            if (c11 != null) {
                arrayList3.add(c11);
            }
        }
        builder.addAll(C7714v.Y0(arrayList3));
        ArrayList b12 = cdnConfig.b();
        ArrayList arrayList4 = new ArrayList(C7714v.z(b12, 10));
        Iterator it4 = b12.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((a.c) it4.next()).a());
        }
        builder.addAll(C7714v.Y0(arrayList4));
        ArrayList b13 = cdnConfig.b();
        ArrayList arrayList5 = new ArrayList();
        Iterator it5 = b13.iterator();
        while (it5.hasNext()) {
            String b14 = ((a.c) it5.next()).b();
            if (b14 != null) {
                arrayList5.add(b14);
            }
        }
        builder.addAll(C7714v.Y0(arrayList5));
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.b();
    }
}
