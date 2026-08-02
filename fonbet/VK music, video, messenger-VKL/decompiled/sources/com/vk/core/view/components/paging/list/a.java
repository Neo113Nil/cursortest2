package com.vk.core.view.components.paging.list;

import android.content.Context;
import android.util.TypedValue;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vkontakte.android.R;
import xsna.epx;
import xsna.gko;
import xsna.gzs;
import xsna.krv0;
import xsna.tlo0;
import xsna.tq;

/* compiled from: PlaceholderConfig.kt */
/* loaded from: classes17.dex */
public final class a {
    public final VkPlaceholder.c a;
    public final VkPlaceholder.b b;
    public final VkPlaceholder.a c;

    /* compiled from: PlaceholderConfig.kt */
    /* renamed from: com.vk.core.view.components.paging.list.a$a, reason: collision with other inner class name */
    public static final class C0851a {
        /* JADX WARN: Multi-variable type inference failed */
        public static a a(Context context, gzs gzsVar) {
            TypedValue typedValue = krv0.a;
            return new a(new VkPlaceholder.c.b(new gko(epx.f(krv0.i(context), Boolean.TRUE) ? R.drawable.vk_icon_illustration_antenna_dark_56 : R.drawable.vk_icon_illustration_antenna_light_56), null, null, 30), new VkPlaceholder.b(tq.h(tlo0.Companion, R.string.ds_internal_placeholder_no_network_title), new tlo0.f(R.string.ds_internal_placeholder_no_network_subtitle), (com.vk.core.compose.component.semantics.a) null, 10), new VkPlaceholder.a(new VkPlaceholder.a.C0854a(new tlo0.f(R.string.ds_internal_placeholder_no_network_retry_action), gzsVar, null, null, null, VkButton.Mode.Tertiary, null, false, null, 1916), (VkPlaceholder.a.C0854a) (0 == true ? 1 : 0), 6));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
    }

    public final int hashCode() {
        VkPlaceholder.c cVar = this.a;
        int hashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        VkPlaceholder.b bVar = this.b;
        int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        VkPlaceholder.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlaceholderConfig(top=" + this.a + ", middle=" + this.b + ", bottom=" + this.c + ')';
    }

    public /* synthetic */ a(VkPlaceholder.c.b bVar, VkPlaceholder.b bVar2, VkPlaceholder.a aVar, int i) {
        this((i & 1) != 0 ? null : bVar, (i & 2) != 0 ? null : bVar2, (i & 4) != 0 ? null : aVar);
    }

    public a(VkPlaceholder.c cVar, VkPlaceholder.b bVar, VkPlaceholder.a aVar) {
        this.a = cVar;
        this.b = bVar;
        this.c = aVar;
    }
}
