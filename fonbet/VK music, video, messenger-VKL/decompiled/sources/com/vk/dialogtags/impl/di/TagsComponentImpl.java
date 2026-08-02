package com.vk.dialogtags.impl.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.dialogtags.api.TagsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.ewy;
import xsna.fpf0;
import xsna.qcy;
import xsna.yo80;

/* compiled from: TagsComponentImpl.kt */
/* loaded from: classes18.dex */
public final class TagsComponentImpl implements TagsComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new yo80(9));

    /* compiled from: TagsComponentImpl.kt */
    public static final class a implements b7m<TagsComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new TagsComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(TagsComponentImpl.class, "tagsFactory", "getTagsFactory()Lcom/vk/dialogtags/api/TagsFactory;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.dialogtags.api.TagsComponent
    public final com.vk.dialogtags.api.a we() {
        qcy<Object> qcyVar = b[0];
        return (com.vk.dialogtags.api.a) this.a.c();
    }
}
