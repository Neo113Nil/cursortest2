package com.vk.catalog2.common.dto.ui;

import com.vk.catalog2.common.dto.api.app.AppContent;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.data.ApiApplication;
import java.util.Objects;
import xsna.dfp0;
import xsna.epx;

/* compiled from: UIBlockAppContent.kt */
/* loaded from: classes16.dex */
public final class UIBlockAppContent extends UIBlock implements dfp0 {
    public static final Serializer.c<UIBlockAppContent> CREATOR = new a();
    public final ApiApplication y;
    public final AppContent z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockAppContent> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockAppContent a(Serializer serializer) {
            return new UIBlockAppContent(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockAppContent[i];
        }
    }

    public UIBlockAppContent(com.vk.catalog2.common.dto.api.ui.a aVar, ApiApplication apiApplication, AppContent appContent) {
        super(aVar);
        this.y = apiApplication;
        this.z = appContent;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return String.valueOf(this.y.b.b);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.y);
        serializer.i0(this.z);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockAppContent) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        if (!epx.f(this.y, ((UIBlockAppContent) obj).y)) {
            return false;
        }
        AppContent appContent = this.z;
        return epx.f(appContent, appContent);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, this.z);
    }

    @Override // xsna.dfp0
    public final String r() {
        return this.z.f;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return "App_Content[content: " + this.z + ", app: " + this.y + ']';
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        com.vk.catalog2.common.dto.api.ui.a Ab = Ab();
        ApiApplication apiApplication = new ApiApplication(this.y);
        AppContent appContent = this.z;
        return new UIBlockAppContent(Ab, apiApplication, new AppContent(appContent.b, appContent.c, appContent.d, appContent.e, appContent.f, appContent.g, appContent.h));
    }

    public UIBlockAppContent(Serializer serializer) {
        super(serializer);
        this.y = (ApiApplication) serializer.G(ApiApplication.class.getClassLoader());
        this.z = (AppContent) serializer.G(AppContent.class.getClassLoader());
    }
}
