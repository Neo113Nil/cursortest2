package com.vk.repository.internal.repos.stickers.suggests;

import com.vk.api.generated.store.dto.StoreNewItemsDto;
import com.vk.api.generated.vmoji.dto.VmojiPromotionDto;
import com.vk.api.generated.vmoji.dto.VmojiStickersSuggestionsDto;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerItem;
import com.vk.internal.api.GsonHolder;
import io.reactivex.rxjava3.disposables.b;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.asu0;
import xsna.ck70;
import xsna.epx;
import xsna.ho8;
import xsna.hwi0;
import xsna.kbl0;
import xsna.pmi0;
import xsna.qeu0;
import xsna.rsg0;
import xsna.shy;
import xsna.urd0;
import xsna.y19;
import xsna.yfb;
import xsna.yte;
import xsna.zcl;
import xsna.zk30;
import xsna.zq70;

/* compiled from: VmojiPromoInSuggestsRepositoryImpl.kt */
/* loaded from: classes5.dex */
public final class VmojiPromoInSuggestsRepositoryImpl {
    public VmojiStickersSuggestionsDto c;
    public final LinkedHashMap a = new LinkedHashMap();
    public List<StickerItem> b = EmptyList.b;
    public final b d = new b();

    /* compiled from: VmojiPromoInSuggestsRepositoryImpl.kt */
    public static final class VmojiPromoInSuggestsConfig {

        @pmi0("characterId")
        private String characterId;

        @pmi0("countOfPromoDisplays")
        private int countOfPromoDisplays;

        @pmi0("suggestionsHash")
        private String suggestionsHash;

        @pmi0("timeOfLastMarkPromoAsViewed")
        private long timeOfLastMarkPromoAsViewed;

        public VmojiPromoInSuggestsConfig() {
            this(0L, 0, null, null, 15, null);
        }

        public final String a() {
            return this.characterId;
        }

        public final int b() {
            return this.countOfPromoDisplays;
        }

        public final String c() {
            return this.suggestionsHash;
        }

        public final long d() {
            return this.timeOfLastMarkPromoAsViewed;
        }

        public final void e(String str) {
            this.characterId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VmojiPromoInSuggestsConfig)) {
                return false;
            }
            VmojiPromoInSuggestsConfig vmojiPromoInSuggestsConfig = (VmojiPromoInSuggestsConfig) obj;
            return this.timeOfLastMarkPromoAsViewed == vmojiPromoInSuggestsConfig.timeOfLastMarkPromoAsViewed && this.countOfPromoDisplays == vmojiPromoInSuggestsConfig.countOfPromoDisplays && epx.f(this.characterId, vmojiPromoInSuggestsConfig.characterId) && epx.f(this.suggestionsHash, vmojiPromoInSuggestsConfig.suggestionsHash);
        }

        public final void f(int i) {
            this.countOfPromoDisplays = i;
        }

        public final void g(String str) {
            this.suggestionsHash = str;
        }

        public final void h(long j) {
            this.timeOfLastMarkPromoAsViewed = j;
        }

        public final int hashCode() {
            return this.suggestionsHash.hashCode() + urd0.a(shy.a(this.countOfPromoDisplays, Long.hashCode(this.timeOfLastMarkPromoAsViewed) * 31, 31), 31, this.characterId);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VmojiPromoInSuggestsConfig(timeOfLastMarkPromoAsViewed=");
            sb.append(this.timeOfLastMarkPromoAsViewed);
            sb.append(", countOfPromoDisplays=");
            sb.append(this.countOfPromoDisplays);
            sb.append(", characterId=");
            sb.append(this.characterId);
            sb.append(", suggestionsHash=");
            return ho8.a(sb, this.suggestionsHash, ')');
        }

        public VmojiPromoInSuggestsConfig(long j, int i, String str, String str2) {
            this.timeOfLastMarkPromoAsViewed = j;
            this.countOfPromoDisplays = i;
            this.characterId = str;
            this.suggestionsHash = str2;
        }

        public /* synthetic */ VmojiPromoInSuggestsConfig(long j, int i, String str, String str2, int i2, zcl zclVar) {
            this((i2 & 1) != 0 ? System.currentTimeMillis() : j, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2);
        }
    }

    public static void b(boolean z) {
        HashMap<UserId, kbl0> hashMap = kbl0.b;
        VmojiPromoInSuggestsConfig e = kbl0.a.b().e();
        if (z) {
            e.f(0);
            e.h(System.currentTimeMillis());
        } else {
            e.f(e.b() + 1);
        }
        kbl0 b = kbl0.a.b();
        b.getClass();
        Preference.H(b.a, "stickers_vmoji_promo_in_suggests_display_config", GsonHolder.a().toJson(e));
    }

    public final void a() {
        this.b = EmptyList.b;
        this.a.clear();
        this.c = null;
        this.d.e();
        HashMap<UserId, kbl0> hashMap = kbl0.b;
        kbl0 b = kbl0.a.b();
        VmojiPromoInSuggestsConfig vmojiPromoInSuggestsConfig = new VmojiPromoInSuggestsConfig(0L, 0, null, null, 15, null);
        b.getClass();
        Preference.H(b.a, "stickers_vmoji_promo_in_suggests_display_config", GsonHolder.a().toJson(vmojiPromoInSuggestsConfig));
        asu0.a.getClass();
        asu0.n().execute(new y19(this));
    }

    public final void c(StoreNewItemsDto storeNewItemsDto) {
        VmojiStickersSuggestionsDto f;
        VmojiPromotionDto u = storeNewItemsDto.u();
        if (u == null || (f = u.f()) == null) {
            return;
        }
        HashMap<UserId, kbl0> hashMap = kbl0.b;
        VmojiPromoInSuggestsConfig e = kbl0.a.b().e();
        if (epx.f(f.e(), e.c()) && epx.f(f.d(), e.a())) {
            return;
        }
        this.c = f;
        int i = 0;
        this.d.b(rsg0.w0(yfb.x(zq70.I(new zq70(), null, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED))).m(asu0.a.c()).l(new ck70(14, new hwi0(20))).subscribe(new qeu0(new a(1, this, VmojiPromoInSuggestsRepositoryImpl.class, "processVmojiPromoDictionary", "processVmojiPromoDictionary(Ljava/util/List;)V", i, 0), 2), new zk30(new yte(1, this, VmojiPromoInSuggestsRepositoryImpl.class, "processError", "processError(Ljava/lang/Throwable;)V", i, 12), 26)));
    }
}
