package com.vk.dto.stories.model.clickable;

import com.ironsource.X3;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.stories.entities.stat.ClickableStickerStatInfo;
import com.vk.metrics.eventtracking.b;
import com.vk.superapp.api.dto.story.WebClickablePoint;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vk.superapp.api.dto.story.actions.WebActionApp;
import defpackage.q0;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.epx;
import xsna.q500;
import xsna.tv4;
import xsna.zcl;

/* compiled from: ClickableApp.kt */
/* loaded from: classes18.dex */
public final class ClickableApp extends ClickableSticker {
    public static final Serializer.c<ClickableApp> CREATOR = new a();
    public final WebActionApp e;
    public final ApiApplication f;
    public boolean g;
    public final WebStickerType h;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ClickableApp> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClickableApp a(Serializer serializer) {
            return new ClickableApp(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClickableApp[i];
        }
    }

    public /* synthetic */ ClickableApp(long j, List list, q500 q500Var, WebActionApp webActionApp, ApiApplication apiApplication, boolean z, int i, zcl zclVar) {
        this((i & 1) != 0 ? -1L : j, list, (i & 4) != 0 ? null : q500Var, (i & 8) != 0 ? null : webActionApp, (i & 16) != 0 ? null : apiApplication, (i & 32) != 0 ? false : z);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final void Ab(ClickableStickerStatInfo.a aVar) {
        WebActionApp webActionApp = this.e;
        aVar.a(webActionApp != null ? Integer.valueOf(webActionApp.b) : null, "mini_app_id");
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final WebStickerType Cb() {
        return this.h;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.W(this.c);
        serializer.d0(this.d);
        serializer.i0(this.e);
        serializer.i0(this.f);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker, xsna.bxx
    public final JSONObject e5() {
        String str;
        JSONObject e5 = super.e5();
        WebActionApp webActionApp = this.e;
        Integer valueOf = webActionApp != null ? Integer.valueOf(webActionApp.b) : null;
        if (valueOf == null) {
            tv4.b("You can't pass app sticker without id", b.a);
        }
        if (valueOf != null) {
            e5.put("app_id", valueOf.intValue());
        }
        if (webActionApp != null && (str = webActionApp.c) != null) {
            e5.put(X3.i.L0, str);
        }
        return e5;
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableApp) || !super.equals(obj)) {
            return false;
        }
        ClickableApp clickableApp = (ClickableApp) obj;
        return epx.f(this.e, clickableApp.e) && epx.f(this.f, clickableApp.f) && this.g == clickableApp.g;
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        WebActionApp webActionApp = this.e;
        int hashCode2 = (hashCode + (webActionApp != null ? webActionApp.hashCode() : 0)) * 31;
        ApiApplication apiApplication = this.f;
        return Boolean.hashCode(this.g) + ((hashCode2 + (apiApplication != null ? apiApplication.hashCode() : 0)) * 31);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final String toString() {
        StringBuilder sb = new StringBuilder("ClickableApp(actionApp=");
        sb.append(this.e);
        sb.append(", appModel=");
        sb.append(this.f);
        sb.append(", hasNewInteractions=");
        return q0.a(sb, this.g, ')');
    }

    public ClickableApp(long j, List<WebClickablePoint> list, q500 q500Var, WebActionApp webActionApp, ApiApplication apiApplication, boolean z) {
        super(j, list, q500Var);
        this.e = webActionApp;
        this.f = apiApplication;
        this.g = z;
        this.h = WebStickerType.APP;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClickableApp(Serializer serializer) {
        this(r1, r0 == null ? EmptyList.b : r0, serializer.y(), (WebActionApp) serializer.G(WebActionApp.class.getClassLoader()), (ApiApplication) serializer.G(ApiApplication.class.getClassLoader()), serializer.m());
        long w = serializer.w();
        List k = serializer.k(WebClickablePoint.class);
    }
}
