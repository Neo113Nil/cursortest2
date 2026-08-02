package app.effectum.filter.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.media.filters.di.FiltersComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.fpf0;
import xsna.nwy;
import xsna.ob0;
import xsna.qcy;
import xsna.tfr;

/* compiled from: FiltersComponentImpl.kt */
/* loaded from: classes12.dex */
public final class FiltersComponentImpl implements FiltersComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new ob0(13));

    /* compiled from: FiltersComponentImpl.kt */
    public static final class a implements b7m<FiltersComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new FiltersComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(FiltersComponentImpl.class, "filtersBridge", "getFiltersBridge()Lcom/vk/media/filters/bridge/FiltersBridge;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.media.filters.di.FiltersComponent
    public final tfr r7() {
        qcy<Object> qcyVar = b[0];
        return (tfr) this.a.c();
    }
}
