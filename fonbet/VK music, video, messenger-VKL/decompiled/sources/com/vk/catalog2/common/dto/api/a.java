package com.vk.catalog2.common.dto.api;

import android.os.Bundle;
import com.vk.catalog2.common.dto.api.SearchRequestFactory;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.x;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.bpn0;
import xsna.dja;
import xsna.ft0;
import xsna.gzs;
import xsna.hda;
import xsna.v6;
import xsna.wba;
import xsna.wzs;

/* compiled from: CatalogWithRecentSearchRequestFactory.kt */
/* loaded from: classes16.dex */
public abstract class a extends SearchRequestFactory {
    public final gzs<x<List<String>>> p;
    public final String q;
    public final bpn0 r;

    /* compiled from: CatalogWithRecentSearchRequestFactory.kt */
    /* renamed from: com.vk.catalog2.common.dto.api.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0479a extends FunctionReferenceImpl implements wzs<hda, List<? extends String>, hda> {
        @Override // xsna.wzs
        public final hda invoke(hda hdaVar, List<? extends String> list) {
            hda hdaVar2 = hdaVar;
            ((dja) this.receiver).b(hdaVar2, list);
            return hdaVar2;
        }
    }

    public a(wba wbaVar, gzs gzsVar, String str, SearchRequestFactory.a aVar, Bundle bundle, int i) {
        super(wbaVar, (i & 8) != 0 ? null : aVar, (i & 16) != 0 ? null : bundle);
        this.p = gzsVar;
        this.q = str;
        this.r = new bpn0(new v6(this, 8));
    }

    @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory
    public final q i(String str, boolean z) {
        return q(str).w();
    }

    public abstract x<hda> p(String str);

    public x<hda> q(String str) {
        x<hda> p = p(str);
        if (str.length() == 0) {
            p = x.B(p, this.p.invoke(), new ft0(new C0479a(2, (dja) this.r.getValue(), dja.class, "transform", "transform(Lcom/vk/catalog2/common/dto/api/CatalogResponse;Ljava/util/List;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 10));
        }
        return p.m(io.reactivex.rxjava3.android.schedulers.a.b());
    }
}
