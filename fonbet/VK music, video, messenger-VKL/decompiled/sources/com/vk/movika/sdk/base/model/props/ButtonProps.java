package com.vk.movika.sdk.base.model.props;

import kotlinx.serialization.KSerializer;
import xsna.imi0;

@imi0
/* loaded from: classes3.dex */
public final class ButtonProps {
    public static final Companion Companion = new Companion();
    public final TextProps a;
    public final BackgroundProps b;
    public final ShapeProps c;

    public static final class Companion {
        public final KSerializer<ButtonProps> serializer() {
            return ButtonProps$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ButtonProps(int i, TextProps textProps, BackgroundProps backgroundProps, ShapeProps shapeProps) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = textProps;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = backgroundProps;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = shapeProps;
        }
    }

    public ButtonProps() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
