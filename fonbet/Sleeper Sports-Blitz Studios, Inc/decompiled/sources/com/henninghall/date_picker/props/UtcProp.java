package com.henninghall.date_picker.props;

import com.facebook.react.bridge.Dynamic;

/* loaded from: classes8.dex */
public class UtcProp extends Prop<Boolean> {
    public static final String name = "utc";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.henninghall.date_picker.props.Prop
    public Boolean toValue(Dynamic dynamic) {
        return Boolean.valueOf(dynamic.asBoolean());
    }
}
