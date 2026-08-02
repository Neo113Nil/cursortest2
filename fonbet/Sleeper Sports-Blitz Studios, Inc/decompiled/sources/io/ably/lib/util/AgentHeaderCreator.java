package io.ably.lib.util;

import io.ably.lib.transport.Defaults;
import java.util.Map;

/* loaded from: classes9.dex */
public class AgentHeaderCreator {
    public static final String AGENT_DIVIDER = "/";
    private static final String AGENT_ENTRY_SEPARATOR = " ";

    public static String create(Map<String, String> map, PlatformAgentProvider platformAgentProvider) {
        StringBuilder sb = new StringBuilder();
        sb.append(Defaults.ABLY_AGENT_VERSION);
        if (map != null && !map.isEmpty()) {
            sb.append(" ");
            sb.append(getAdditionalAgentEntries(map));
        }
        String createPlatformAgent = platformAgentProvider.createPlatformAgent();
        if (createPlatformAgent != null) {
            sb.append(" ");
            sb.append(createPlatformAgent);
        }
        return sb.toString();
    }

    private static String getAdditionalAgentEntries(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        for (String str : map.keySet()) {
            String str2 = map.get(str);
            sb.append(str);
            if (str2 != null) {
                sb.append("/");
                sb.append(str2);
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
