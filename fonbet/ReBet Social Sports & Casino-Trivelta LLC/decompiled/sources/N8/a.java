package N8;

import com.giphy.sdk.core.models.Media;
import com.giphy.sdk.core.models.Meta;
import com.giphy.sdk.core.models.Pagination;
import com.giphy.sdk.core.network.response.ListMediaResponse;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: N8.a$a, reason: collision with other inner class name */
    public static final class C0161a implements K8.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f7910a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f7911b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f7912c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ K8.a f7913d;

        public C0161a(boolean z10, boolean z11, boolean z12, K8.a aVar) {
            this.f7910a = z10;
            this.f7911b = z11;
            this.f7912c = z12;
            this.f7913d = aVar;
        }

        @Override // K8.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ListMediaResponse listMediaResponse, Throwable th2) {
            Integer offset;
            if ((listMediaResponse != null ? listMediaResponse.getData() : null) != null && listMediaResponse.getMeta() != null) {
                List<Media> data = listMediaResponse.getData();
                Intrinsics.checkNotNull(data);
                boolean z10 = this.f7910a;
                boolean z11 = this.f7911b;
                boolean z12 = this.f7912c;
                int i10 = 0;
                for (Object obj : data) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    Media media = (Media) obj;
                    Meta meta = listMediaResponse.getMeta();
                    Intrinsics.checkNotNull(meta);
                    media.setResponseId(meta.getResponseId());
                    if (z10) {
                        j.d(media, Boolean.TRUE);
                        j.e(media, "emoji");
                    }
                    if (z11) {
                        j.f(media, Boolean.TRUE);
                        j.e(media, "text");
                    }
                    if (z12) {
                        j.e(media, "favorites");
                    }
                    Pagination pagination = listMediaResponse.getPagination();
                    media.setPosition(Integer.valueOf(i10 + ((pagination == null || (offset = pagination.getOffset()) == null) ? 0 : offset.intValue())));
                    i10 = i11;
                }
            }
            a.d(this.f7913d, listMediaResponse, th2);
        }
    }

    public static final K8.a b(K8.a aVar, boolean z10, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new C0161a(z10, z11, z12, aVar);
    }

    public static /* synthetic */ K8.a c(K8.a aVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            z12 = false;
        }
        return b(aVar, z10, z11, z12);
    }

    public static final void d(K8.a aVar, ListMediaResponse listMediaResponse, Throwable th2) {
        aVar.a(listMediaResponse, th2);
    }
}
