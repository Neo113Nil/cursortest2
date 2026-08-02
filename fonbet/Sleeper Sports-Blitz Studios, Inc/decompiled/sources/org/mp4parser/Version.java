package org.mp4parser;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes10.dex */
public class Version {
    private static final Logger LOG = LoggerFactory.getLogger((Class<?>) Version.class);
    public static final String VERSION;

    static {
        String str;
        try {
            str = new LineNumberReader(new InputStreamReader(Version.class.getResourceAsStream("/version2.txt"))).readLine();
        } catch (IOException e) {
            LOG.warn(e.getMessage());
            str = "unknown";
        }
        VERSION = str;
    }
}
