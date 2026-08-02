package io.ktor.http;

import io.ktor.util.StringValuesBuilder;
import io.sentry.protocol.OperatingSystem;
import kotlin.Metadata;

/* compiled from: Parameters.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/ktor/http/ParametersBuilder;", "Lio/ktor/util/StringValuesBuilder;", "Lio/ktor/http/Parameters;", OperatingSystem.JsonKeys.BUILD, "()Lio/ktor/http/Parameters;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ParametersBuilder extends StringValuesBuilder {
    @Override // io.ktor.util.StringValuesBuilder
    Parameters build();
}
