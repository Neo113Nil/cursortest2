package androidx.media3.datasource;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;
import xsna.evk;
import xsna.lhg;

/* loaded from: classes12.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {
    public final Map<String, List<String>> headerFields;
    public final byte[] responseBody;
    public final int responseCode;

    @Nullable
    public final String responseMessage;

    public HttpDataSource$InvalidResponseCodeException(int i, @Nullable String str, @Nullable DataSourceException dataSourceException, Map map, evk evkVar, byte[] bArr) {
        super(lhg.a(i, "Response code: "), dataSourceException, evkVar, 2004);
        this.responseCode = i;
        this.responseMessage = str;
        this.headerFields = map;
        this.responseBody = bArr;
    }
}
