package com.vk.movika.sdk.base.model.props;

import kotlinx.serialization.KSerializer;
import xsna.imi0;

@imi0
/* loaded from: classes3.dex */
public final class AreaProps {
    public static final Companion Companion = new Companion();
    public final BackgroundProps a;
    public final ShapeProps b;

    public static final class Companion {
        public final KSerializer<AreaProps> serializer() {
            return AreaProps$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AreaProps(int i, BackgroundProps backgroundProps, ShapeProps shapeProps) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = backgroundProps;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = shapeProps;
        }
    }

    public AreaProps(BackgroundProps backgroundProps, ShapeProps shapeProps) {
        this.a = backgroundProps;
        this.b = shapeProps;
    }

    public AreaProps() {
        this(null, null);
    }
}
