package com.vk.movika.sdk.base.model.props;

import kotlinx.serialization.KSerializer;
import xsna.imi0;

@imi0
/* loaded from: classes3.dex */
public final class BorderProps {
    public static final Companion Companion = new Companion();
    public final Double a;
    public final String b;
    public final Double c;

    public static final class Companion {
        public final KSerializer<BorderProps> serializer() {
            return BorderProps$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BorderProps(int i, Double d, String str, Double d2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = d;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d2;
        }
    }

    public BorderProps() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
