package org.chromium.net.httpflags;

import com.google.protobuf.A;
import com.google.protobuf.MessageLite;
import java.util.List;
import org.chromium.net.httpflags.FlagValue;

/* loaded from: classes6.dex */
public interface FlagValueOrBuilder extends A {
    FlagValue.ConstrainedValue getConstrainedValues(int i11);

    int getConstrainedValuesCount();

    List<FlagValue.ConstrainedValue> getConstrainedValuesList();

    /* synthetic */ MessageLite getDefaultInstanceForType();

    @Override // com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
